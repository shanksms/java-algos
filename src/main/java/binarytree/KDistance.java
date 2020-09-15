package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KDistance {

  // Recursive function to print right view of a binary tree.
  ArrayList<Integer> Kdistance(TreeNode<Integer> root, int k)
  {
    // Your code here

    if (root  == null) return null;

    Queue<TreeNode<Integer>> queue = new LinkedList<>();
    queue.offer(root);
    List<ArrayList<Integer>> result = new ArrayList<>();
    while (!queue.isEmpty() && k >= 0) {

      ArrayList<Integer> list = null;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        list = new ArrayList<>();
        TreeNode<Integer> node = queue.poll();
        list.add(node.data);
        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }
      k--;
      if (list != null) {
        result.add(list);
      }
    }
    System.out.println(result.size());
    return result.get(result.size() - 1);
  }

}
