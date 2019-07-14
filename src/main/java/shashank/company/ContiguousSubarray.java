package shashank.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContiguousSubarray {



  public static long countSubarrays(List<Integer> numbers, int k) {
    // Write your code here
    int count = 0;

    for (int x = 0; x < numbers.size(); x++)
    {
      // j is the number of elements which should be printed
      for (int y = x; y < numbers.size(); y++)
      {
        int product = 1;
        // print the array from i to j
        for (int z = x;z <= y; z++)
        {
          product *= numbers.get(z);
          System.out.print(numbers.get(z));
        }
        if (product <= k ) count++;
        System.out.println();
      }
    }
    System.out.println("Count is " + count);
    return count;
  }

  public static SinglyLinkedListNode removeNodes(SinglyLinkedListNode listHead, int x) {
    // Write your code here
    SinglyLinkedListNode dummyNode = new SinglyLinkedListNode();
    dummyNode.next = listHead;
    SinglyLinkedListNode current = listHead;
    SinglyLinkedListNode previous = dummyNode;
    while (current != null) {
      if (current.data > x) {
        previous.next = current.next;
        current = current.next;
      } else {
        previous = current;
        current = current.next;
      }
    }

    return dummyNode.next;
  }

  public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {
    // Write your code here
    List<Integer> result = new ArrayList<>();
    for (String q : query) {
      int count = 0;

      for (String name : names) {
        if (name.length() == q.length()) continue;
        else if(name.startsWith(q)) count++;

      }
      result.add(count);
    }
    return result;

  }

  public static void main(String[] args) {
    System.out.println(findCompletePrefixes(Arrays.asList("jackson", "jack", "jacques"), Arrays.asList("jack")));
  }


}

class SinglyLinkedListNode {
  int data;
  SinglyLinkedListNode next;
}