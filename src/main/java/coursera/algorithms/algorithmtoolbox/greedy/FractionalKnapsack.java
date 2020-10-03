package coursera.algorithms.algorithmtoolbox.greedy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Problem Introduction
 * Athieffindsmuchmorelootthanhisbagcanfit.Helphimtofindthemostvaluablecombination of
 * items assuming that any fraction of a loot item can be put into his bag.
 * Problem Description Task. The goal of this code problem is to implement an algorithm for the fractional knapsack problem. Input Format.
 * Thefirstlineofthe inputcontainsthenumber n ofitemsandthecapacity W ofaknapsack. Thenext n linesdefinethevaluesandweightsoftheitems.
 * The i-thlinecontainsintegers vi and wi—the value and the weight of i-th item, respectively.
 * Constraints. 1 ≤ n ≤ 103, 0 ≤ W ≤ 2·106; 0 ≤ vi ≤ 2·106, 0 < wi ≤ 2·106 for all 1 ≤ i ≤ n.
 * All the numbers are integers. Output Format. Output the maximal value of fractions of items that fit into the knapsack.
 * The absolute value of the difference between the answer of your program and the optimal value should be at most 10−
 * 3. To ensure this, output your answer with at least four digits after the decimal point (otherwise your answer, while being computed correctly,
 * can turn out to be wrong because of rounding issues).
 * Sample 1. Input: 3 50 60 20 100 50 120 30 Output: 180.0000 To achieve the value 180, we take the first item and the third item into the bag.
 * Sample 2. Input: 1 10 500 30 Output: 166.6667 Here, we just take one third of the only available item.
 */
public class FractionalKnapsack {
  private static double getOptimalValue(int capacity, int[] values, int[] weights) {
    double value = 0;
    //write your code here

    double [] [] wv = new double[weights.length][2];
    for (int i = 0; i < weights.length; i++) {
      wv[i][0] = (double) weights[i];
      wv[i][1] = (double) values[i];
    }
    Arrays.sort(wv, Comparator.comparingDouble(o -> -o[1]/o[0]));

    int j = 0;
    while (capacity > 0 && j < wv.length) {

      double weightToExtract = Double.min(wv[j][0], capacity);
      capacity -=  weightToExtract;
      value += weightToExtract * ((double)wv[j][1] / (double) wv[j][0]);
      j++;
    }

    BigDecimal bd = new BigDecimal(Double.toString(value));
    bd = bd.setScale(4, RoundingMode.HALF_UP);
    return bd.doubleValue();
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int capacity = scanner.nextInt();
    int[] values = new int[n];
    int[] weights = new int[n];
    for (int i = 0; i < n; i++) {
      values[i] = scanner.nextInt();
      weights[i] = scanner.nextInt();
    }
    System.out.println(getOptimalValue(capacity, values, weights));
  }


}
