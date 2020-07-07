package arrays;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class LongestConsecutiveTest {

  private LongestConsecutive longestConsecutive;
  @Before
  public void setUp() {
    longestConsecutive = new LongestConsecutive();
  }

  @Test
  public void longestConsecutive_sortingMethod() {
    int a [] = {1, 2, 3, 4};
    MatcherAssert.assertThat(longestConsecutive.longestConsecutive_sortingMethod(a), CoreMatchers.equalTo(4));

  }

  @Test
  public void longestConsecutive_hashSetMethod() {
  }
}