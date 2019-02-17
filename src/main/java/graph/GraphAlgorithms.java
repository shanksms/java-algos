package graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphAlgorithms {

    public boolean findRoutesBetweenTwoNodes(Node start, Node end) {
        if (start == end) {
            return true;
        }
        if (start == null || end == null) {
            return false;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(start);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            node.setState(State.VISITED);
            if (node == end) {
                return true;
            }

            for (Node children : node.getChildren()) {
                if (children.getState() == State.UNVISITED) {
                    queue.add(children);
                }
            }
        }
        return false;
    }




}
