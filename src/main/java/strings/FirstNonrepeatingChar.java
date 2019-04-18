package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonrepeatingChar {

    public static void main(String[] args) {

    }

    public int firstUniqCharApproach1(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        Character target = null;
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() == 1) {
                target = entry.getKey();
                break;
            }
        }

        if (target == null) return -1;
        int index = 0;

        for (Character ch : s.toCharArray()) {
            if (target.equals(ch)) return index;
            index++;
        }
        return -1;
    }

    public int firstUniqCharApproach2(String s) {
        int frequency [] = new int[256];

        //Store frequencies
        for (char ch : s.toCharArray()) {
            frequency[ch - 'a'] += 1;
        }
        //Find char with 1 frequency


        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;

    }
}
