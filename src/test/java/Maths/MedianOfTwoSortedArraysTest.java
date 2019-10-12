package Maths;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

  private MedianOfTwoSortedArrays medianOfTwoSortedArrays;
  @Before
  public void setUp() {
    medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
  }

  @Test
  public void findMedianSortedArrays() {

    int [] x = {1, 3, 8, 9, 15};
    int [] y = {7, 11, 19, 21, 25};
    MatcherAssert.assertThat(medianOfTwoSortedArrays.findMedianSortedArrays(x, y), CoreMatchers.equalTo(10.0));


  }
}