package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://www.youtube.com/watch?v=VsxLHGUqAKs
 */
public class IterativeInorderTraversal {

  public List<Integer> iterativeInorderTraversal(TreeNode<Integer> root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    TreeNode<Integer> current = root;
    while (current != null || !stack.isEmpty()) {
      if (current != null) {
        stack.push(current);
        current = current.left;
      } else {
        TreeNode<Integer> node = stack.pop();
        result.add(node.data);
        current = node.right;
      }
    }


    return result;
  }

}
