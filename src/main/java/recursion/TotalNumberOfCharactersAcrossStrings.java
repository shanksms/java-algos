package recursion;

/**
 * Use recursion to write a function that accepts an array of strings and returns the total number of characters across all the strings.
 * For example, if the input array is ["ab", "c", "def", "ghij"], the output should be 10 since there are 10 characters in total.
 */
public class TotalNumberOfCharactersAcrossStrings {

  public int recursiveSolution(String [] input) {

    if (input.length == 1) return input[0].length();
    else {
      String [] copy = new String[input.length - 1];
      System.arraycopy(input, 1, copy,0, copy.length);
      return input[0].length() + recursiveSolution(copy);
    }


  }

}
