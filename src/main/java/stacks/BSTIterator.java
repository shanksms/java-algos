package stacks;

import binarytree.TreeNode;
import java.util.Stack;

/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 *
 * Calling next() will return the next smallest number in the BST.
 *
 *
 *
 * Example:
 *
 *
 *
 * BSTIterator iterator = new BSTIterator(root);
 * iterator.next();    // return 3
 * iterator.next();    // return 7
 * iterator.hasNext(); // return true
 * iterator.next();    // return 9
 * iterator.hasNext(); // return true
 * iterator.next();    // return 15
 * iterator.hasNext(); // return true
 * iterator.next();    // return 20
 * iterator.hasNext(); // return false
 *
 *
 * Note:
 *
 * next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 * You may assume that next() call will always be valid, that is, there will be at least a next smallest number in the BST when next() is called.
 */
public class BSTIterator {
  private Stack<TreeNode<Integer>> stack;

  public BSTIterator(TreeNode root) {
    stack = new Stack<>();
    while (root != null) {
      stack.push(root);
      if (root.left != null) {
        root = root.left;
      } else {
        break;
      }
    }
  }

  /** @return the next smallest number */
  public int next() {
    TreeNode<Integer> node = stack.pop();
    TreeNode<Integer> current = node;
    current = current.right;
    while (current != null) {
      stack.push(current);
      if (current.left != null) {
        current = current.left;
      } else {
        break;
      }
    }
    return node.data;

  }

  /** @return whether we have a next smallest number */
  public boolean hasNext() {
    return !stack.isEmpty();
  }

}
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
