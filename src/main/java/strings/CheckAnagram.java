package strings;

public class CheckAnagram {

    public static boolean checkAnagramForLowerCaseAsciiChars(String s, String t) {
        int [] cMap = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            cMap[s.charAt(i) - 'a']++;
            cMap[t.charAt(i) - 'a']--;

        }

        for (int count : cMap) {
            if (count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkAnagramForLowerCaseAsciiChars("ab", "a"));
    }

}
