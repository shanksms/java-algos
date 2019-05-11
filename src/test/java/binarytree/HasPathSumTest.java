package binarytree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HasPathSumTest {
  private HasPathSum hasPathSum;

  @Before
  public void setUp() throws Exception {
    hasPathSum = new HasPathSum();
  }

  @Test
  public void hasPathSum() {
    TreeNode<Integer> root = new TreeNode<>(2);
    TreeNode<Integer> left = new TreeNode<>(3);
    TreeNode<Integer> right = new TreeNode<>(4);
    root.left = left;
    root.right = right;
    //5 exists as one of the path sum
    assertThat(hasPathSum.hasPathSum(5, root), equalTo(true));
    //10 does not exists as one of the path sum
    assertThat(hasPathSum.hasPathSum(10, root), equalTo(false));

  }
}