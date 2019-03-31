package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {

    public static String reverseWords(String input) {
        input = input.trim().replaceAll(" +", " ");
        String [] words =  input.split(" ");
        List<String> ls = Arrays.stream(words).collect(Collectors.toList());
        Collections.reverse(ls);
        return String.join(" ", ls);

    }

    public static void main(String[] args) {
        System.out.println(reverseWords("shashank    srivastava "));

    }

   
}
