package graph;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/union-find/
 *a graph is a valid tree if:
 *  1) there are no cycles
 *  2) number of nodes - 1 = number of edgess
 *
 * Given n nodes labeled from 0 to n-1 and a list of undirected edges (each edge is a pair of nodes), write a function to check whether these edges make up a valid tree.
 *
 * Example 1:
 *
 * Input: n = 5, and edges = [[0,1], [0,2], [0,3], [1,4]]
 * Output: true
 * Example 2:
 *
 * Input: n = 5, and edges = [[0,1], [1,2], [2,3], [1,3], [1,4]]
 * Output: false
 * Note: you can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0,1] is the same as [1,0] and thus will not appear together in edges.
 */
public class GraphAValidTree {
    public boolean validTree(int n, int[][] edges) {
        int [] islands = new int[n];
        Arrays.fill(islands, -1);

        for (int i = 0; i < edges.length; i++) {
            int x = find(islands, edges[i][0]);
            int y = find(islands, edges[i][1]);
            //if x == y, then cycle is found
            if (x == y) return false;
            //union
            islands[x] = y;
        }

        //a graph is a tree if it does not contain any cycle and subject to below condition
        return edges.length == n - 1;
    }

    private int find(int [] nums, int i) {
        if (nums[i] == -1) return i;
        return find(nums, nums[i]);
    }

    public static void main(String[] args) {
        int [] [] edges = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
        System.out.println(new GraphAValidTree().validTree(5, edges));
    }
}