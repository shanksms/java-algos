package binarytree;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

/**
 * Maximum Width of Tree
 * Given a Binary Tree, find the maximum width of it. Maximum width is defined as the maximum number of nodes in any level.
 * For example, maximum width of following tree is 4 as there are 4 nodes at 3rd level.
 *
 *           1
 *        /     \
 *      2        3
 *    /    \    /    \
 *   4    5   6    7
 *     \
 *       8
 *
 * Example 1:
 *
 * Input:
 *        1
 *      /    \
 *     2      3
 * Output: 2
 * Example 2:
 *
 * Input:
 *         10
 *       /     \
 *     20      30
 *    /    \
 *   40    60
 * Output: 2
 * Your Task:
 * You don't have to read any input. Just complete the function getMaxWidth() that takes node as parameter and returns the maximum width. The printing is done by the driver code.
 *
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(N).
 *
 * Constraints:
 * 1 <= edges <= 1000
 * 1 <= nodes values <= 105
 *
 *
 * ** For More Input/Output Examples Use 'Expected Output' option **
 */
public class MaxWidth {


  public int maxWidth(TreeNode<Integer> root) {
    if (Objects.isNull(root)) return  0;

    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);
    int maxWidth = Integer.MIN_VALUE;
    while (!queue.isEmpty()) {

      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode<Integer> node = queue.poll();
        if (Objects.nonNull(node.left)) queue.offer(node.left);
        if (Objects.nonNull(node.right)) queue.offer(node.right);

      }
      if (maxWidth < size) {
        maxWidth = size;
      }
    }

    return maxWidth;
  }



}
