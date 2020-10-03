package coursera.algorithms.algorithmtoolbox;

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

/**
 * In this programming challenge, your goal is to implement a program that works in less than one second even on huge datasets.
 * In section Maximum Pairwise Product of the file week1_programming_challenges/week1_programming_challenges.pdf we walk you through a step-by-step process of solving this challenge. We will encounter several common pitfalls and will show you how to fix them.
 *
 * The archive file with all the statements and starters is available from a separate page (that can be found at the left pane under Resources):
 */
public class MaxPairwiseProduct {
  static long getMaxPairwiseProduct(int[] numbers) {
    int n = numbers.length;
    Arrays.sort(numbers);
    List<Long> collect = Arrays.stream(numbers).mapToObj(e -> (long) e)
        .collect(Collectors.toList());

    return collect.get(n - 1) * collect.get(n - 2);
  }


  public static void main(String[] args) {
    FastScanner scanner = new FastScanner(System.in);
    int n = scanner.nextInt();
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }
    System.out.println(getMaxPairwiseProduct(numbers));
  }

  static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    FastScanner(InputStream stream) {
      try {
        br = new BufferedReader(new
            InputStreamReader(stream));
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
