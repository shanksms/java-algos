package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a n-ary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * For example, given a 3-ary tree:
 *
 *
 *
 *
 *
 *
 * We should return its max depth, which is 3.
 */

public class MaximumDepthOfNaryTree {
    public int maxDepth(Node root) {
        //This is to handle if root is null
        if (root == null) return 0;
        //this is to handle leaf node cases
        if (root.children.size() == 0) return 1;
        List<Integer> heights = new ArrayList<>();
        for (Node child : root.children) {
            heights.add(maxDepth(child));
        }
        return Collections.max(heights) + 1;
    }

}

class Node {
    int value;
    List<Node> children;
}
