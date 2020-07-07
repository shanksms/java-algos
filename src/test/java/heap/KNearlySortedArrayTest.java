package heap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KNearlySortedArrayTest {
  private KNearlySortedArray kNearlySortedArray;

  @Before
  public void setUp() throws Exception {
    kNearlySortedArray = new KNearlySortedArray();
  }

  @Test
  public void kNearlySorted() {
    System.out.println(kNearlySortedArray.kNearlySorted(3, new int[]{6, 5, 3, 2, 8, 10, 9}));
  }
}