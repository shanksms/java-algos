package strings;

public class TelephoneNumberFormatting {

    public static String formatTelNumber(String telNumber) {
        //s = "12345"
        int len = telNumber.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        if (len == 2) {
            return sb.append(telNumber).toString();
        }
        while (i + 2 <= len  && len - i != 4 ) {
            sb.append(telNumber.charAt(i));
            sb.append(telNumber.charAt(i + 1));
            sb.append(telNumber.charAt(i + 2));
            sb.append("-");
            i += 3;
        }

        if (len - i == 4) {
            sb.append(telNumber.charAt(i));
            sb.append(telNumber.charAt(i + 1));
            sb.append("-");
            sb.append(telNumber.charAt(i + 2));
            sb.append(telNumber.charAt(i + 3));
        }
        if (len - i == 2) {
            sb.append(telNumber.charAt(i));
            sb.append(telNumber.charAt(i + 1));
        }

        //remove  - if it is appended at the end
        String result = sb.toString();
        if (result.charAt(result.length() - 1) == '-') {
            result = result.substring(0, result.length() - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(formatTelNumber("123"));
    }
}
