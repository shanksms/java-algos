package coursera.algorithms.algorithmtoolbox.greedy;

import java.util.*;

public class CarFueling {
  static int computeMinRefills(int dist, int tank, int[] stops) {
    int[] stopsWithStartAndEnd = new int[stops.length + 2];
    System.arraycopy(stops, 0, stopsWithStartAndEnd, 1, stops.length);
    stopsWithStartAndEnd[0] = 0;
    stopsWithStartAndEnd[stopsWithStartAndEnd.length - 1] = dist;
    int lastRefill = 0; int currentRefill = 0;
    int numberOfRefills = 0;
    int n = stops.length;
    while (currentRefill <= n) {
      currentRefill = lastRefill;

      while(currentRefill <= n
          && stopsWithStartAndEnd[currentRefill + 1] - stopsWithStartAndEnd[lastRefill] <= tank) {
        currentRefill = currentRefill + 1;
      }
      if (currentRefill == lastRefill) return -1;

      if (currentRefill <= n) {
        numberOfRefills += 1;
      }
      lastRefill = currentRefill;


    }


    return numberOfRefills;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int dist = scanner.nextInt();
    int tank = scanner.nextInt();
    int n = scanner.nextInt();
    int stops[] = new int[n];
    for (int i = 0; i < n; i++) {
      stops[i] = scanner.nextInt();
    }

    System.out.println(computeMinRefills(dist, tank, stops));
  }
}
