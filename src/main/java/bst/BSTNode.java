package bst;

public class BSTNode<T> {

  public BSTNode(T data, BSTNode<T> left, BSTNode<T> right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }

  T data;
  BSTNode<T> left, right;
}
