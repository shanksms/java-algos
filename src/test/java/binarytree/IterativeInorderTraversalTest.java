package binarytree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class IterativeInorderTraversalTest {
  private IterativeInorderTraversal iterativeInorderTraversal;

  @Before
  public void setUp() throws Exception {
    iterativeInorderTraversal = new IterativeInorderTraversal();
  }

  @Test
  public void iterativeInorderTraversal() {
    TreeNode<Integer> root = new TreeNode<>(1);
    TreeNode<Integer> left = new TreeNode<>(2);
    TreeNode<Integer> right = new TreeNode<>(3);
    root.left = left;
    root.right = right;
    assertThat(iterativeInorderTraversal.iterativeInorderTraversal(root), equalTo(Arrays.asList(2, 1, 3)));
  }
}