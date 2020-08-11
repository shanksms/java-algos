package bst;

public class BinarySearchTreeCheck {

  public boolean isTreeBinarySearchTree(BSTNode<Integer> root) {


    return areKeysInRange(Integer.MIN_VALUE, Integer.MAX_VALUE, root);
  }

  private boolean areKeysInRange(int lower, int upper, BSTNode<Integer> node) {

    if (node == null) {
      return true;
    } else if (node.data < lower && node.data > upper) {
      return false;
    }

    return areKeysInRange(lower, node.data, node.left) && areKeysInRange(node.data, upper, node.right);
  }

}
