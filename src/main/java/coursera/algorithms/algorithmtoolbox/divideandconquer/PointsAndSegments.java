package coursera.algorithms.algorithmtoolbox.divideandconquer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//this is incomplete
public class PointsAndSegments {

    static class Event {
        int coordinate;
        int type;
        int index;

         Event(int coordinate, int type, int index) {
            this.coordinate = coordinate;
            this.type = type;
            this.index = index;
        }
    }

    private static int[] fastCountSegments(int[] starts, int[] ends, int[] points) {
        int[] cnt = new int[points.length];
        List<Event> events = new ArrayList<>();
        for (int i=0; i < starts.length; i++) {
            Event event = new Event(starts[i], 'l', i);
            //events.add(event);

        }

        //write your code here
        return cnt;
    }

    private static int[] naiveCountSegments(int[] starts, int[] ends, int[] points) {
        int[] cnt = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < starts.length; j++) {
                if (starts[j] <= points[i] && points[i] <= ends[j]) {
                    cnt[i]++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] starts = new int[n];
        int[] ends = new int[n];
        int[] points = new int[m];
        for (int i = 0; i < n; i++) {
            starts[i] = scanner.nextInt();
            ends[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            points[i] = scanner.nextInt();
        }
        //use fastCountSegments
        int[] cnt = fastCountSegments(starts, ends, points);
        for (int x : cnt) {
            System.out.print(x + " ");
        }
    }
}
