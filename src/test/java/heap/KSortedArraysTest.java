package heap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KSortedArraysTest {

  private KSortedArrays kSortedArrays;

  @Before
  public void setUp() throws Exception {
    kSortedArrays = new KSortedArrays();
  }

  @Test
  public void mergeKSortedArrays() {
    int [] [] input = {{1, 2}, {1, 3}};
    System.out.println(kSortedArrays.mergeKSortedArrays(input, 2));
  }
}