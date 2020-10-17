package arrays;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class ThreeSumEqualToZeroTest {
  private ThreeSumEqualToZero threeSumEqualToZero;

  @Before
  public void setUp() throws Exception {
    threeSumEqualToZero = new ThreeSumEqualToZero();
  }

  @Test
  public void solution() {
    int [] array = new int[]{0, -2, 7, 2, 4, -6};
    MatcherAssert.assertThat(threeSumEqualToZero.solution(array), CoreMatchers.equalTo(2));
  }
}