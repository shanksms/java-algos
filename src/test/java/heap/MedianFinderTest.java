package heap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MedianFinderTest {
  private MedianFinder medianFinder;

  @Before
  public void setUp() throws Exception {
    medianFinder = new MedianFinder();
  }

  @Test
  public void findMedian() {
    medianFinder.addNum(5);
    System.out.println(medianFinder);
  }
}