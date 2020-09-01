package shashank.company.societe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPacking {
  public static Integer arrayPacking( List<Integer> integers ) {

    //List<String> listOfStr = new ArrayList<>();
    List<char []> listOfChar = new ArrayList<>();

    for (Integer num : integers) {
      //listOfStr.add(Integer.toBinaryString(num));
      char [] cA1 = Integer.toBinaryString(num).toCharArray();
      char [] cA2 =  new char[] {'0', '0', '0', '0', '0', '0', '0', '0'};
      listOfChar.add(cA2);
      System.arraycopy(cA1, 0, cA2, cA2.length - cA1.length, cA1.length);
    }

    StringBuilder sb = new StringBuilder();
    for (int i = listOfChar.size() - 1; i >= 0; i--) {
      sb.append(listOfChar.get(i));
    }

   // System.out.println(sb.toString());

    return Integer.parseInt(sb.toString(), 2);
  }

  public static void main(String[] args) {
    System.out.println(arrayPacking(Arrays.asList(24, 85, 0)));
    //System.out.println(Integer.toBinaryString(24));
  }


}
