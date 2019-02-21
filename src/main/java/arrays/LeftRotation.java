package arrays;

public class LeftRotation {

    public static void main(String[] args) {
        int result[] = rotLeft(new int[]{1, 2, 3, 4}, 1);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int [] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            j = (i + d) % b.length;

            b[i] = a[j];

        }
        return b;
    }

}
