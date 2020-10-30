package recursion;

/**
 * This problem is known as the “Unique Paths” problem: Let’s say you have a grid of rows and columns.
 * Write a function that accepts a number of rows and a number of columns, and calculates the number of possible “shortest” paths from
 * the upper-leftmost square to the lower-rightmost square.
 *
 * For example, here’s what the grid looks like with three rows and seven columns. You want to get from the “S” (Start) to the “F” (Finish).
 * https://learning.oreilly.com/library/view/a-common-sense-guide/9781680508048/f_0111.xhtml#learning.to.write.in.recursive.exercises
 *
 */
public class UniqueShortestPath {

  public int solution(int [][] grid) {

    if (grid.length == 0) return -1;
    else if (grid.length == 1 && grid[0].length == 2) {
      return 1;
    } else if (grid.length == 2 && grid[0].length == 1 && grid[1].length == 1) {
      return 1;
    } else {
      int[][] grid1 = copy(1, 0, grid.length - 1, grid[0].length, grid);
      int[][] grid2 = copy(0, 1, grid.length, grid[0].length - 1, grid);

      return solution(grid1) + solution(grid2);
    }

  }

  private int[][] copy(int rowIndex, int columnIndex,  int targetRowSize, int targetColumnSize, int[][] source) {
    int[][] grid = new int[targetRowSize][targetColumnSize];
    int intialColIndex = columnIndex;
    for (int i = 0; i < targetRowSize; i++) {
      columnIndex = intialColIndex;
      for (int j = 0; j < targetColumnSize; j++) {
        grid[i][j] = source[rowIndex][columnIndex];
        columnIndex++;
      }
      rowIndex++;
    }

    return grid;
  }
}
