package binarytree;

public class KthSmallestElementFromBST {
    int count = 0;
    int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return result;
    }
    private void helper(TreeNode<Integer> root, int k) {
        if (root == null) return;
        helper(root.getLeft(), k);
        count++;
        if (count == k) result = root.getData();
        helper(root.getRight(), k);
        return;

    }
}

