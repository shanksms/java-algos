package binarytree;

import lombok.val;

public class InsertIntoBST {
  public TreeNode insertIntoBST(TreeNode<Integer> root, int val) {
    if (root == null) return new TreeNode(val);
    if (root.data > val) root.left = insertIntoBST(root.left, val);
    if (root.data < val) root.right = insertIntoBST(root.right, val);
    return root;
  }

}
