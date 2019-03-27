package strings;

public class RunlengthEncoding {

    private  static String decode(String encodedString) {
        //eg. 2a3b
        int count = 0;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < encodedString.length(); i++) {
            if (Character.isDigit(encodedString.charAt(i))) {
                //we are multiplying count by 10 to consider cases like 12a3b
                count = count*10 + encodedString.charAt(i) - '0';
            } else {
                while(count > 0) {
                    builder.append(encodedString.charAt(i));
                    count--;
                }
                count = 0;
            }
        }

        return builder.toString();
    }

    private  static String encode(String string) {
        //$ is appended to cover for the edge case.
        // if we dont append $, the code will throw out of bound exception
        String newStr = string + "$";
        StringBuilder builder = new StringBuilder();
        int count = 1;
        for (int i = 0; i < string.length(); i++) {
            if (newStr.charAt(i) == newStr.charAt(i + 1)) {
                count++;
            } else {
                builder.append(count  + "" + (char)newStr.charAt(i));
                count = 1;
            }
        }



        return builder.toString();
    }


    public static void main(String[] args) {
        System.out.println(decode("2a3b"));
        System.out.println(encode("aabbb"));
    }

}
