package strings;

public class IntToStringConversion {

  public String toString(int num) {
    StringBuilder sb = new StringBuilder();
    if (num == 0) {
      return "0";
    }
    boolean isNeg = false;
    if (num < 0) {
      num = -num;
      isNeg = true;
    }
    while (num > 0) {
      sb.append((char) ('0' +num % 10));
      num /= 10;
    }


    return isNeg ? "-" + sb.reverse().toString() : sb.reverse().toString();
  }

  public int toInt(String str) {

    int result = 0;
    boolean isNeg = false;
    if (str.startsWith("-")) {
      str = str.substring(1);
      isNeg = true;
    }

    for (char ch : str.toCharArray()) {
      result = 10*result + (ch - '0');

    }

    return isNeg ? -result : result;
  }

}
