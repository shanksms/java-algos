package graph;

import java.util.Arrays;
import java.util.Collections;

public class GraphTraversal {

    public void dfs(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getName());
        root.setVisited(true);
        for (Node child : root.getChildren()){
            if (!child.isVisited()) {
                dfs(child);
            }

        }


    }

    public static void main(String[] args) {

        Node n3 = new Node("3rd", Collections.EMPTY_LIST, false) ;
        Node n2 = new Node("2nd", Collections.EMPTY_LIST, false);
        Node n1 = new Node("1st", Arrays.asList(n2), false);
        Node n0 = new Node("0th", Arrays.asList(n1, n2, n3), false);
        Graph g = new Graph(Arrays.asList(n0, n1, n2, n3));
        GraphTraversal traversal = new GraphTraversal();
        traversal.dfs(n0);
    }
}
