package graph;


import lombok.Data;

import java.util.List;

@Data
public class Node {
    private String name;
    private List<Node> children;
    private boolean visited;
}
