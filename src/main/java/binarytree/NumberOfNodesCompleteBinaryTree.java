package binarytree;

import sun.reflect.generics.tree.Tree;

/**
 * Given a complete binary tree, count the number of nodes.
 *
 * Note:
 *
 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 *
 * Example:
 *
 * Input:
 *     1
 *    / \
 *   2   3
 *  / \  /
 * 4  5 6
 *
 * Output: 6
 *
 * https://leetcode.com/problems/count-complete-tree-nodes/discuss/61958/Concise-Java-solutions-O(log(n)2)
 *
 */
public class NumberOfNodesCompleteBinaryTree {

    private int height(TreeNode root) {
        //notice in case root is null, tree height is -1
        if (root == null) return -1;
        //in case of complete binary tree, height of the left subtree should be the
        //height of the tree.
        return 1 + height(root.getLeft());

    }
    public int countNodes(TreeNode root) {
        int h = height(root);
        return h < 0 ? 0
                : height(root.getRight()) == h - 1 ? (1 << h - 1 + 1) + countNodes(root.getRight())
                : (1 << (h - 1) -1 + 1) + countNodes(root.getLeft());
    }


}


