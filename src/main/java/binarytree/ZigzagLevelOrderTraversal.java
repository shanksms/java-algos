package binarytree;

import java.util.*;

/**
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its zigzag level order traversal as:
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 */

public class ZigzagLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode<Integer> root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        queue.add(root);


        int level = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            result.add(new ArrayList());
            for (int i = 0; i < size; i ++) {
                TreeNode<Integer> node = queue.remove();
                result.get(level).add(node.getData());
                if (node.getLeft() != null) queue.add(node.getLeft());
                if (node.getRight() != null) queue.add(node.getRight());
            }

            //This step will reverse the odd level elements
            if (level % 2 == 1) {
                Collections.reverse(result.get(level));
            }
            level++;
        }

        return result;

    }
}
