package graph.leetcode.graph;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally
 * or vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 * Example 1:
 *
 * Input:
 * 11110
 * 11010
 * 11000
 * 00000
 *
 * Output: 1
 * Example 2:
 *
 * Input:
 * 11000
 * 11000
 * 00100
 * 00011
 *
 * Output: 3
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int nr = grid.length;
        int nc = grid[0].length;
        int count = 0;
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (grid[i][j] == '1') {
                    ++count;
                    dfs(i, j, nr, nc, grid);
                }
            }
        }

        return count;
    }

    public void dfs(int i, int j, int nr, int nc, char [][] grid) {

        if (i < 0 || j  < 0 || i >= nr || j >= nc || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        //go left
        dfs(i - 1, j, nr, nc, grid);
        //go right
        dfs(i + 1 , j , nr, nc, grid);
        //go up
        dfs(i , j - 1, nr, nc, grid);
        //go down
        dfs(i , j + 1, nr, nc, grid);


    }

    public static void main(String[] args) {
        NumberOfIslands numberOfIslands = new NumberOfIslands();

    }


}
