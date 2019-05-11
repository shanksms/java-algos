package binarytree;

public class HasPathSum {

  public boolean hasPathSum(int target, TreeNode<Integer> root) {


    return helper(root, target, 0);
  }
  private boolean helper(TreeNode<Integer> root, int target, int sum) {
    if (root == null) return false;
    sum += root.data;
    //base condition. We've reached leaf node
    if (root.left == null && root.right == null) {
      return target == sum;
    }


    return helper(root.left, target, sum) || helper(root.right, target, sum);
  }

}
