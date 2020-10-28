package recursion;

/**
 * Let’s say we have a staircase of N steps, and a person has the ability to climb one, two, or
 * three steps at a time. How many different possible “paths” can someone take to reach the top?
 * Write a function that will calculate this for N steps.The image displays three possible paths of jumping up a five-step staircase.
 */
public class StaircaseProblems {

  public int recursionSolution(int n) {

    if (n == 1 || n == 0) {
      return 1;
    } else if (n < 0) {
      return 0;
    } else {
      return recursionSolution(n - 3) + recursionSolution(n - 2) + recursionSolution(n - 1);

    }

  }


}
