package graph;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Node {
    private String name;
    private List<Node> children;
    //By defualt, at the time of creation, Nodes will be unvisited.
    private State state = State.UNVISITED;
    private boolean visited;
}
