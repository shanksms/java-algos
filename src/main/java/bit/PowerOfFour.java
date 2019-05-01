package bit;

public class PowerOfFour {
    public boolean isPowerOfFour(int num) {


        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
    }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}
