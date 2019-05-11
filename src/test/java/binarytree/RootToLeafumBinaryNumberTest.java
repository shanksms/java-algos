package binarytree;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class RootToLeafumBinaryNumberTest {
  private RootToLeafumBinaryNumber rootToLeafumBinaryNumber;

  @Before
  public void setUp() throws Exception {
    rootToLeafumBinaryNumber = new RootToLeafumBinaryNumber();
  }

  @Test
  public void rootToLeafSum() {
    TreeNode<Integer> root = new TreeNode<>(1);
    TreeNode<Integer> left = new TreeNode<>(0);
    TreeNode<Integer> right = new TreeNode<>(1);
    root.left = left;
    root.right = right;
    assertThat(rootToLeafumBinaryNumber.rootToLeafSum(root), equalTo(5));

  }
}