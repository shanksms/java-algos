package binarytree;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class InsertIntoBSTTest {
  InsertIntoBST insertIntoBST;

  @Before
  public void setUp() throws Exception {
    insertIntoBST = new InsertIntoBST();
  }

  @Test
  public void insertIntoBST() {
    TreeNode<Integer> root = new TreeNode<>(2);
    TreeNode<Integer> left = new TreeNode<>(1);
    TreeNode<Integer> right = new TreeNode<>(3);
    root.left = left; root.right = right;

    TreeNode<Integer> resultRoot = new TreeNode<>(2);
    TreeNode<Integer> resultLeft = new TreeNode<>(1);
    TreeNode<Integer> resultRight = new TreeNode<>(3);
    resultRight.right = new TreeNode<>(4);
    resultRoot.left = resultLeft; resultRoot.right = resultRight;
    MatcherAssert.assertThat(insertIntoBST.insertIntoBST(root, 4), CoreMatchers.equalTo(resultRoot));


  }
}