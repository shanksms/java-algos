package slidingwindow;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
 *
 * Example:
 *
 * MovingAverage m = new MovingAverage(3);
 * m.next(1) = 1
 * m.next(10) = (1 + 10) / 2
 * m.next(3) = (1 + 10 + 3) / 3
 * m.next(5) = (10 + 3 + 5) / 3
 */
public class MovingAverage {
    int size;
    Queue<Integer> queue;
    double sum;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        queue = new LinkedList<>();
        this.size = size;
    }

    public double next(int val) {
        if (queue.size() == this.size) {
            sum = sum - queue.poll();
        }

        sum += val;
        queue.offer(val);
        return sum / queue.size();
    }

    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(2));
        System.out.println(movingAverage.next(3));
    }
}
