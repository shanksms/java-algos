package binarytree;


import java.util.LinkedList;
import java.util.Queue;

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

    public void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.remove();
            System.out.print(node.getData());
            System.out.print(" ");
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }

        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int diff = findHeight(root.getLeft()) - findHeight(root.getRight());

        if (Math.abs(diff) > 1) {
            return false;
        } else {
            return isBalanced(root.getLeft()) && isBalanced(root.getRight());
        }


    }

    private int checkHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = checkHeight(root.getLeft());
        int rightHeight = checkHeight(root.getRight());

        if (leftHeight == -100 || rightHeight == -100) {
            return -100;
        }

        int diff = Math.abs(leftHeight - rightHeight);
        if (diff > 1) {
            return -100;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }

    }
    public boolean isBalancedBetterRuntime(TreeNode root) {
        return checkHeight(root) != -100;

    }

    public int findHeight(TreeNode root) {

        if (root == null) {
            return -1;
        }

        return Math.max(findHeight(root.getLeft()), findHeight(root.getRight())) + 1;


    }

    //Program to find lowest common ancestors
    public TreeNode findLCA(TreeNode<Integer> root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.getData() > n1 && root.getData() > n2) {
            return findLCA(root.getLeft(), n1, n2);
        }
        if (root.getData() < n1 && root.getData() < n2) {
            return findLCA(root.getRight(), n1, n2);
        }
        return root;


    }

    //Program to check BST property of a BST
    public boolean checkBST(TreeNode<Integer> root) {
        //At root level, min and max does not apply
        return checkBSTHelper(root, null, null);

    }

    private boolean checkBSTHelper(TreeNode<Integer> root, Integer min, Integer max) {
        //Idea is to keep passing down min and max value and check if it violates at any node.
        if (root == null) {
            return true;
        }
        if (min != null && root.getData() <= min) {
            return false;
        }

        if (max != null && root.getData() >= max) {
            return false;
        }

        return checkBSTHelper(root.getLeft(), min, root.getData())
                && checkBSTHelper(root.getRight(),  root.getData(), max) ;
    }

    public void testBinaryTreeHeight() {
        TreeNode root = new TreeNode(2, null, null);
        root.setLeft(
                new TreeNode(
                        1, new TreeNode(4, null, null), null
                )
        );
        root.setRight(new TreeNode(3, new TreeNode(4, null, null), null));
        System.out.println(findHeight(root));

    }
    public void testBuildBSTFromSortedArray() {
        TreeNode<Integer> root = buildBSTFromSortedArray(new int[] {1, 2, 3, 4, 5});
        System.out.println(root);
    }

    public void testIsBalanced() {
        TreeNode root = new TreeNode(2, null, null);
        root.setLeft(
                new TreeNode(
                        1, new TreeNode(4, null, null), null
                )
        );
        root.setRight(new TreeNode(3, new TreeNode(4, null, null), null));

        boolean status = isBalanced(root);
        System.out.println(status);
    }



    public static void main(String[] args) {
        BinaryTreeAlgorithm binaryTreeAlgorithm = new BinaryTreeAlgorithm();
        //binaryTreeAlgorithm.testBuildBSTFromSortedArray();
        //binaryTreeAlgorithm.testBinaryTreeHeight();
        binaryTreeAlgorithm.testIsBalanced();

    }
}
