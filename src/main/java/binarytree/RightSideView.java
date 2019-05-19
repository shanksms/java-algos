package binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
  public List<Integer> rightSideView_ApproachOne(TreeNode<Integer> root) {
    if (root == null) return Collections.emptyList();

    Queue<TreeNode<Integer>> queue = new LinkedList<>();
    queue.offer(root);
    List<List<Integer>> bfs = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    int level = 0;
    while(!queue.isEmpty()) {
      bfs.add(new ArrayList<>());
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode <Integer>node = queue.poll();
        bfs.get(level).add(node.data);
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
      }
      if (bfs.get(level).size() != 0) {
        int len = bfs.get(level).size();
        result.add(bfs.get(level).get(len - 1));
      }
      level++;

    }
    return result;


  }

}
