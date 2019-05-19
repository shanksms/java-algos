package binarytree;

/**
 * Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
 *
 * Basically, the deletion can be divided into two stages:
 *
 * Search for a node to remove.
 * If the node is found, delete the node.
 * Note: Time complexity should be O(height of tree).
 *
 * Example:
 *
 * root = [5,3,6,2,4,null,7]
 * key = 3
 *
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Given key to delete is 3. So we find the node with value 3 and delete it.
 *
 * One valid answer is [5,4,6,2,null,null,7], shown in the following BST.
 *
 *     5
 *    / \
 *   4   6
 *  /     \
 * 2       7
 *
 * Another valid answer is [5,2,6,null,4,null,7].
 *
 *     5
 *    / \
 *   2   6
 *    \   \
 *     4   7
 *
 */
public class DeleteNodeInBST {
  private TreeNode predecessor(TreeNode root) {
    if (root != null) root = root.left;
    TreeNode p = null;
    while (root != null){
      p = root;
      root = root.right;
    }

    return p;
  }

  private TreeNode<Integer> successor(TreeNode<Integer> root) {
    if (root != null) root = root.right;
    TreeNode<Integer> s = null;
    while (root != null) {
      s = root;
      root = root.left;
    }

    return s;
  }


  public TreeNode<Integer> deleteNode(TreeNode<Integer> root, int key) {

    if (root == null) return null;
    if (root.data > key) root.left = deleteNode(root.left, key);
    else if (root.data < key) root.right = deleteNode(root.right, key);
    else {
      if (root.left == null && root.right == null) {
        root = null; return root;
      } else if (root.right != null) {
        TreeNode<Integer> successor = successor(root);
        root.data = successor.data;
        root.right = deleteNode(root.right, successor.data);
      } else {
        TreeNode<Integer> predecessor = predecessor(root);
        root.data = predecessor.data;
        root.left = deleteNode(root.left, predecessor.data);
      }
    }

    return root;
  }

}
