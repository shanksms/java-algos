package arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

//Element should be distinct. That is why we have to collect the elements in to a set
public class ThirdMaxElementInAnArray {
    public int thirdMax(int[] nums) {

        String s = "s";
        s.chars().filter( e -> (char) e != ' '  && (char) e != '-');
        return 0;
    }

    public static void main(String[] args) {
        String s = "shahsank";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ' || c == '-') {
                continue;
            } else {
                sb.append(c + "");
            }
        }
        System.out.println(sb.toString());
    }
}
