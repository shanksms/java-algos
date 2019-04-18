package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {

    public void reverseWords(char[] str) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : str) {
            if (ch == ' ')  {
                list.add(sb.toString());
                sb = new StringBuilder();
                continue;
            }
            sb.append(ch);

        }
        list.add(sb.toString());

        Collections.reverse(list);
        String resultStr = String.join(" ", list);
        for (int i = 0; i < str.length; i++) {
            str[i] = resultStr.charAt(i);
        }

    }

    public static void main(String[] args) {
        char [] ch = new char[] {'a', 'b', ' ', 'c'};
        new ReverseWordsInAString().reverseWords(ch);
        System.out.println(ch);
    }


}
