package strings;

public class BaseConversion {

  public String convertFromBaseTen(int numAsInt, int base) {
    //below code does not handle negative numbers
    StringBuilder sb = new StringBuilder();
    while (numAsInt > 0) {
      sb.append((char) (numAsInt % base >= 10 ?  'A' + numAsInt % base - 10 : '0' + numAsInt % base));
      numAsInt /= base;

    }

    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    int ch = 65;
    System.out.println((char) ch);
  }

}
