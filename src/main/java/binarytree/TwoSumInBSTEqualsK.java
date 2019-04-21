package binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.
 *
 * Example 1:
 *
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 9
 *
 * Output: True
 *
 *
 * Example 2:
 *
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 28
 *
 * Output: False
 */
public class TwoSumInBSTEqualsK {
  public boolean findTarget(TreeNode root, int k) {
    List<Integer> inOrderList = new ArrayList<>();
    inOrderTraversal(root, inOrderList);
    int i = 0;
    int j = inOrderList.size() - 1;
    while (i < j) {
      if (inOrderList.get(i) + inOrderList.get(j) > k) {
        j--;
      } else if (inOrderList.get(i) + inOrderList.get(j) < k) {
        i++;
      } else {
        return true;
      }
    }


    return false;
  }

  private void inOrderTraversal(TreeNode<Integer> root, List<Integer> result) {
    if (root == null) return;
    inOrderTraversal(root.left, result);
    result.add(root.data);
    inOrderTraversal(root.right, result);
    return;
  }

}
