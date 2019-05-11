package binarytree;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class RootToLeadSumBinaryNumberTest {
  private RootToLeadSumBinaryNumber rootToLeadSumBinaryNumber;

  @Before
  public void setUp() throws Exception {
    rootToLeadSumBinaryNumber = new RootToLeadSumBinaryNumber();
  }

  @Test
  public void rootToLeafSum() {
    TreeNode<Integer> root = new TreeNode<>(1);
    TreeNode<Integer> left = new TreeNode<>(0);
    TreeNode<Integer> right = new TreeNode<>(1);
    root.left = left;
    root.right = right;
    assertThat(rootToLeadSumBinaryNumber.rootToLeafSum(root), equalTo(5));

  }
}