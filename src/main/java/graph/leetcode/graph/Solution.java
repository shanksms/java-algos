package graph.leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        return clone(node);


    }

    public Node clone(Node node) {
        if (map.containsKey(node.val)) return map.get(node.val);

        Node clone = new Node(node.val, new ArrayList<>());
        map.put(clone.val, clone);
        for (Node n : node.neighbors) {
            clone.neighbors.add(clone(n));
        }
        return clone;

    }
}
