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
        while (i + 2 < len  && len - i != 4 ) {
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
        /*if s = "123", result "123"
        ** s = "12345", result = "123-45"
        ** s = "1234", result = "12-34"
        ** s = "123456", result = "123-456"
        ** s = "1234567", result = "123-45-67"
         */
        System.out.println(formatTelNumber("123"));
        System.out.println(formatTelNumber("12345"));
        System.out.println(formatTelNumber("1234"));
        System.out.println(formatTelNumber("123456"));
        System.out.println(formatTelNumber("1234567"));
    }
}
