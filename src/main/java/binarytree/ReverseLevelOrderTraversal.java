package binarytree;

import bst.BSTNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Given a binary tree of size N, find its reverse level order traversal. ie- the traversal must begin from the last level.
 *
 * Example 1:
 *
 * Input :
 *         1
 *       /   \
 *      3     2
 *
 * Output: 3 2 1
 * Explanation:
 * Traversing level 1 : 3 2
 * Traversing level 0 : 1
 * Example 2:
 *
 * Input :
 *        10
 *       /  \
 *      20   30
 *     / \
 *    40  60
 *
 * Output: 40 60 20 30 10
 * Explanation:
 * Traversing level 2 : 40 60
 * Traversing level 1 : 20 30
 * Traversing level 0 : 10
 *
 * Your Task:
 * You dont need to read input or print anything. Complete the function reverseLevelOrder() which takes the root
 * of the tree as input parameter and returns a list containing the reverse level order traversal of the given tree.
 *
 *
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(N)
 *
 *
 * Constraints:
 * 1 ≤ N ≤ 10^4
 */
public class ReverseLevelOrderTraversal {


  public ArrayList<Integer> reverseLevelOrder(TreeNode<Integer> node)
  {
    // code here
    if (node == null) return new ArrayList<>();
    Queue<TreeNode<Integer>> queue = new LinkedList<>();
    Stack<List<Integer>> stack = new Stack<>();
    queue.offer(node);
    while (!queue.isEmpty()) {
      int size = queue.size();
      List<Integer> ls = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        TreeNode<Integer> n = queue.poll();
        ls.add(n.data);
        if (n.left != null) queue.offer(n.left);
        if (n.right != null) queue.offer(n.right);

      }
      stack.push(ls);

    }
    ArrayList<Integer> result = new ArrayList<>();
    while (!stack.isEmpty()) {
      List<Integer> ls = stack.pop();
      for (int e : ls) {
        result.add(e);
      }
    }

    return result;
  }

}
