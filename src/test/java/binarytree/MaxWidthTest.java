package binarytree;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class MaxWidthTest {
  private MaxWidth maxWidth;

  @Before
  public void setUp() throws Exception {
    maxWidth = new MaxWidth();
  }

  @Test
  public void maxWidth() {
    TreeNode<Integer> left = new TreeNode(2);
    TreeNode<Integer> right = new TreeNode(3);
    TreeNode<Integer> root = new TreeNode(1);
    root.left = left;
    root.right = right;

    MatcherAssert.assertThat(maxWidth.maxWidth(root), CoreMatchers.equalTo(2));

  }
}