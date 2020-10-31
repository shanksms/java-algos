package stacks;

import java.util.Stack;

/**
 * A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people,
 * find if there is a celebrity in the party or not.
 * A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j
 * is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.
 * Note: Follow 0 based indexing.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * M[][] = {{0 1 0},
 *          {0 0 0},
 *          {0 1 0}}
 * Output: 1
 * Explanation: 0th and 2nd person both
 * know 1. Therefore, 1 is the celebrity.
 *
 * Example 2:
 *
 * Input:
 * N = 2
 * M[][] = {{0 1},
 *          {1 0}}
 * Output: -1
 * Explanation: The two people at the party both
 * know each other. None of them is a celebrity.
 *
 * Your Task:
 * You don't need to read input or print anything. Complete the function celebrity()
 * which takes the matrix M and its size N as input parameters and returns the index of the celebrity. If no such celebrity is present, return -1.
 *
 *
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 *
 *
 * Constraints:
 * 2 <= N <= 3000
 * 0 <= M[][] <= 1
 */
public class CelebrityProblem {

  public int solution(int M[][], int n) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      stack.push(i);
    }

    while (stack.size() > 1) {

      int first = stack.pop();
      int second = stack.pop();

      //This is the elimination logic. if A  knows B, B could be celebrity
      //or A could be celebrity
      if (knowsOf(first, second, M)) {
        stack.push(second);
      } else {
        stack.push(first);
      }

    }

    int celebrity = stack.pop();
    //lets say, every body in the party does not know any one.
    //still stack will have one element. Below is to cover that case.
    for (int i = 0; i < n; i++) {
      if (i != celebrity && (!knowsOf(i, celebrity, M) || knowsOf(celebrity, i, M))) {
        return -1;
      }
    }

    return celebrity;
  }

  private boolean knowsOf(int first, int second, int [][] M) {

    return M[first][second] == 1 ? true : false;
  }

  public int graphSolution(int M[][], int n) {
    int [] in = new int[n];
    int [] out = new int[n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i != j && knowsOf(i, j, M)) {
          in[j] += 1;
          out[i] += 1;
        }
      }
    }

    //find person with 0 outgoing edges and n - 1 incoming edges
    for (int i = 0; i < n; i++) {
      if (in[i] == n -1 && out[i] == 0) return i;
    }
    return -1;
  }

}
