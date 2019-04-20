package strings;

public class IntegerToString {
  String [] LESS_THAN_TEN = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
      "Nine"};
  String [] LESS_THAN_TWENTY = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
      "Seventeen", "Eighteen", "Nineteen"};
  String [] LESS_THAN_HUNDRED = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
  StringBuilder result = new StringBuilder();


  public String numberToWords(int num) {

    if (num == 0) return "Zero";
    return helper(num);
  }
  private String helper(int num) {
    String result = "";
    if (num < 10) {
      result = LESS_THAN_TEN[num % 10];
    } else if (num < 20) {
      result = LESS_THAN_TWENTY[num % 10];
    } else if (num < 100) {
      result = LESS_THAN_HUNDRED[num / 10] + " " + helper(num % 10);
    } else if (num < 1000) {
      result = helper(num / 100) + " Hundred " + helper(num % 100);
    } else if (num < 1000000) {
      result = helper(num / 1000) + " Thousand " + helper(num % 1000);
    } else if (num < 1000000000) {
      result = helper(num / 1000000) + " Million " + helper(num % 1000000);
    } else {
      result = helper(num / 1000000000) + " Billion " + helper(num % 1000000000);

    }

    return result.trim();
  }

  public static void main(String[] args) {
    System.out.println(new IntegerToString().numberToWords(1000000000));
  }

}
