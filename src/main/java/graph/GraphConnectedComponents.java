package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GraphConnectedComponents {
  public int countComponents(int n, int[][] edges) {

    Map<Integer, List<Integer>> graph = buildGraph(edges, n);
    System.out.println();
    boolean [] visited = new boolean[n];
    int connectedComponents = 0;
    Set<Integer> nodes = graph.keySet();
    for (int node : nodes) {
      if (!visited[node]) {
        //do bfs
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        connectedComponents += 1;
        while(!queue.isEmpty()) {
          int m = queue.poll();
          for (int child : graph.get(m)) {
            if (!visited[child]) queue.add(child);
          }
          visited[m] = true;
        }
      }

    }

    return connectedComponents;
  }

  private  Map<Integer, List<Integer>> buildGraph(int [] [] edges, int n) {
    Map<Integer, List<Integer>> graph =
    IntStream.rangeClosed(0, n-1).boxed().collect(Collectors.toMap(e -> e, e -> new ArrayList()));

    for (int [] edge : edges) {
     graph.get(edge[0]).add(edge[1]);
      graph.get(edge[1]).add(edge[0]);

    }
    return graph;
  }

  public static void main(String[] args) {
    int [] [] edges = {{0, 1}, {1, 2}, {2, 3}};
    System.out.println(new GraphConnectedComponents().countComponentsUnionFind(4, edges));
  }

  public int countComponentsUnionFind(int n, int[][] edges) {
    int[] roots = new int[n];
    Arrays.fill(roots, -1);
    for(int[] e : edges) {
      int root1 = find(roots, e[0]);
      int root2 = find(roots, e[1]);
      if(root1 != root2) {
        roots[root1] = root2;  // union
        n--;
      }
    }
    return n;
  }

  public int find(int[] roots, int id) {
    if (roots[id] == -1) return id;
    return find(roots, roots[id]);
  }

}
