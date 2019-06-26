package slidingwindow;

import java.util.LinkedList;
import java.util.Queue;

public class MovingWeightedMean {
  private int size;
  private Queue<int []> queue;
  private int weightSum;
  private int weightAndElementMultiplicatedSum;

  public MovingWeightedMean(int size) {
    this.size = size;
    queue = new LinkedList<>();
  }

  public double next(int element, int weight) {
    int [] arr = new int[2];
    arr[0] = element;
    arr[1] = weight;
    queue.offer(arr);
    weightSum += arr[1];
    weightAndElementMultiplicatedSum += arr[0] * arr[1];

    if (queue.size() <= size) {
      return weightAndElementMultiplicatedSum / weightSum;
    }
    int [] last = queue.poll();
    weightAndElementMultiplicatedSum -= last[0] * last[1];
    weightSum -= last[1];


    return weightAndElementMultiplicatedSum / weightSum;
  }

}
