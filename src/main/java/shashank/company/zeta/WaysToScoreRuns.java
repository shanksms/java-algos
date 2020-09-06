package shashank.company.zeta;

/**
 * in a gully cricket, batsman can score 1, 2 or 3 run on every shot.
 * Given n, find number ways, batsman can score n runs
 * this is a dynamic programming problem
 */
public class WaysToScoreRuns {

  public Integer waysToScoreRuns(Integer n) {

    int [] ways = new int[n + 1];

    ways[1] = 1;//
    ways[2] =  2;
    ways[3] = 4;

    for (int i = 4; i < n + 1; i++) {
      ways[i] = ways[i - 3] + ways[ i - 2] + ways[i - 1];
    }

    return ways[n];

  }

}
