package queue;

import binarytree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelAnagram {

  public boolean levelAnagram(TreeNode root1, TreeNode root2) {

    if (root1 != null && root2 == null) return false;
    if (root1 == null && root2 != null) return false;
    Queue<TreeNode> queue1 = new LinkedList<>();
    Queue<TreeNode> queue2 = new LinkedList<>();

    while(!queue1.isEmpty() && !queue2.isEmpty()) {

    }



    return false;
  }

}
