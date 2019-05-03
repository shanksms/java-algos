package binarytree;

public class ConvertSortedArrayToBST {
    public TreeNode<Integer> sortedArrayToBST(int[] nums) {


        return helper(0, nums.length - 1, nums);


    }

    private TreeNode<Integer> helper(int left, int right, int [] nums) {
        if (left > right) return null;

        int mid = (left + right) / 2;
        TreeNode<Integer> root = new TreeNode<>(nums[mid]);
        root.left = helper(left, mid - 1, nums);
        root.right = helper(mid + 1, right, nums);

        return root;
    }
}
