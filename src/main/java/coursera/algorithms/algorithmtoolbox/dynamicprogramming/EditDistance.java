package coursera.algorithms.algorithmtoolbox.dynamicprogramming;

import java.util.*;

class EditDistance {
  public static int EditDistance(String s, String t) {
    //write your code here
    char [] a = new char[s.length() + 1];
    char [] b = new char[t.length() + 1];

    System.arraycopy(s.toCharArray(), 0, a, 1, s.length());
    System.arraycopy(t.toCharArray(), 0, b, 1, t.length());
    int [][] result = new int[a.length][b.length];
    for (int i = 0; i < result.length; i++)
      result[i][0] = i;
    for (int i = 0; i < result[0].length; i++)
      result[0][i] = i;

    for (int j = 1; j < b.length; j++ ) {
      for (int i = 1; i < a.length; i++) {
        int inserttion = result[i][j - 1] + 1;
        int deletion = result[i - 1][j] + 1;
        int match = result[i - 1][j - 1];
        int mismatch = result[i - 1][j - 1] + 1;
        if (a[i] == b[j]) {
          result[i][j] = Integer.min(inserttion, Integer.min(deletion, match));
        } else {
          result[i][j] = Integer.min(inserttion, Integer.min(deletion, mismatch));

        }

      }
    }

    return result[a.length - 1][b.length - 1];
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t));
  }

}