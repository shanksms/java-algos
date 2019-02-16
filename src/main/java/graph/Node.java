package graph;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Node {
    private String name;
    private List<Node> children;
    private boolean visited;
}
