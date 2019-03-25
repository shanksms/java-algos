package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the level order traversal of its nodes' values.
 * (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class LevelOrderTraversalProblem {

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
            level++;
        }

        return result;

    }
}
