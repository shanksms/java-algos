package bst;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeCheckTest {
  private BinarySearchTreeCheck binarySearchTreeCheck;

  @Before
  public void setUp() throws Exception {
    binarySearchTreeCheck = new BinarySearchTreeCheck();
  }

  @Test
  public void isTreeBinarySearchTree() {
    BSTNode<Integer> left = new BSTNode<>(1, null, null);
    BSTNode<Integer> right = new BSTNode<>(3, null, null);
    BSTNode<Integer> root = new BSTNode<>(2, left, right);

    MatcherAssert.assertThat(binarySearchTreeCheck.isTreeBinarySearchTree(root), CoreMatchers.equalTo(true));
  }
}