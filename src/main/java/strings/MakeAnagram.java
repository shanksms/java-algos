package strings;

public class MakeAnagram {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        return delta(countChar(a), countChar(b));

    }

    static int [] countChar(String s) {
        int [] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int offset = (int) c - (int) 'a';
            charCount[offset]++;
        }
        return  charCount;

    }

    static int delta(int [] c1, int [] c2) {
        int delta = 0;
        for (int i = 0; i < c1.length; i++) {
            delta += Math.abs(c1[i] - c2[i]);
        }

        return delta;
    }

}
