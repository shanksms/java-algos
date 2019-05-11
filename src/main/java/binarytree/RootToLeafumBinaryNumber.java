package binarytree;

public class RootToLeafumBinaryNumber {
  public int rootToLeafSum(TreeNode<Integer> root) {

    return helper(root, 0);
  }
  private int helper(TreeNode<Integer> root, int sum) {
    if (root == null) return 0;
    sum = sum * 2 + root.data;
    //base case. When node is leaf node
    if (root.left == null && root.right == null) return sum;



    return helper(root.left, sum) + helper(root.right, sum);
  }

}
