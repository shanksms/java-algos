package binarytree;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class RightSideViewTest {

  private RightSideView rightSideView;
  @Before
  public void setUp() throws Exception {
    rightSideView = new RightSideView();
  }

  @Test
  public void rightSideView_ApproachOne() {
    TreeNode<Integer> root = new TreeNode<>(1);
    TreeNode<Integer> left = new TreeNode<>(2);
    TreeNode<Integer> right = new TreeNode<>(3);
    root.left = left; root.right = right;
    MatcherAssert.assertThat(rightSideView.rightSideView_ApproachOne(root), CoreMatchers.hasItems(1, 3));


  }
}