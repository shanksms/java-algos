package bst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TopKElements {

  public List<Integer> findTopKElements(BSTNode<Integer> root, int k) {

    List<Integer> result = new ArrayList<>();
    reverseInorderTraversal(root, result, k);

    return result;
  }

  private void reverseInorderTraversal(BSTNode<Integer> root, List<Integer> result, int k) {


    if (root != null && result.size() < k) {
      reverseInorderTraversal(root.right, result, k);
      result.add(root.data);
      if (result.size() < k) {
        reverseInorderTraversal(root.left, result, k);
      }
    }

  }
}
