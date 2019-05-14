package arrays;

public class LeftRotation {



    // Complete the rotLeft function below.
    public int[] rotLeft(int[] a, int d) {
        int [] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            j = (i + d) % b.length;

            b[i] = a[j];

        }
        return b;
    }

}
