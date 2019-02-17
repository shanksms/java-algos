package binarytree;

public class BinaryTreeAlgorithm {


    public TreeNode buildBSTFromSortedArray(int arr []) {

        return buildBST(0, arr.length - 1, arr);


    }

    private TreeNode buildBST(int start, int end, int arr []) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(arr[mid], null, null);
        root.setLeft(buildBST(start, mid - 1, arr));
        root.setRight(buildBST(mid + 1, end, arr));

        return root;


    }


    public static void main(String[] args) {
        BinaryTreeAlgorithm binaryTreeAlgorithm = new BinaryTreeAlgorithm();
        TreeNode<Integer> root = binaryTreeAlgorithm.buildBSTFromSortedArray(new int[] {1, 2, 3, 4, 5});
        System.out.println(root);
    }
}
