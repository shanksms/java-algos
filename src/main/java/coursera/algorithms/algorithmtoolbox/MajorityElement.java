package coursera.algorithms.algorithmtoolbox;

import java.util.*;
import java.io.*;

public class MajorityElement {
  private static int getMajorityElement(int[] a, int left, int right) {
    if (left == right) {
      return -1;
    }
    if (left + 1 == right) {
      return a[left];
    }

    Map<Integer, Integer> map = new HashMap<>();

    for (int e : a) {
      map.put(e, map.getOrDefault(e, 0) + 1);

    }

    int count = -1;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      count = entry.getValue();
      if (a.length % 2 == 0 && count > a.length / 2) return 0;
      if (a.length % 2 != 0 && count > a.length / 2 ) return 0;
    }

    //write your code here
    return -1;
  }

  public static void main(String[] args) {
    FastScanner scanner = new FastScanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    if (getMajorityElement(a, 0, a.length) != -1) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
  static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    FastScanner(InputStream stream) {
      try {
        br = new BufferedReader(new InputStreamReader(stream));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    String next() {
      while (st == null || !st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }
  }
}

