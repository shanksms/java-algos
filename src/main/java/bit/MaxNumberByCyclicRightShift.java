package bit;

public class MaxNumberByCyclicRightShift {

    public static int findNumberRightShiftsToProduceMaxNumber(int num) {
        //System.out.println(Integer.toBinaryString(num));

        int max = Integer.MIN_VALUE;
        int shift = 0;
        for (int c = 1; c < 32; c++) {
            //preserve the left most set bit
            int n1 = num & 1;

            num = num >>> 1 | n1 << 31;
            if (num > max) {
                max = num;
                shift = c;
            }
            System.out.println(max);

        }

        return shift;
    }

    public static void main(String[] args) {
        System.out.println("num of shifts " + findNumberRightShiftsToProduceMaxNumber(2));
    }
}
