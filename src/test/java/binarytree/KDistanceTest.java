package binarytree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KDistanceTest {

  private KDistance kDistance;

  @Before
  public void setUp() throws Exception {
    kDistance = new KDistance();
  }

  @Test
  public void kdistance() {
    TreeNode<Integer> left = new TreeNode(2);
    TreeNode<Integer> right = new TreeNode(3);
    TreeNode<Integer> root = new TreeNode(1);
    root.left = left;
    root.right = right;
    kDistance.Kdistance(root, 1);
  }
}