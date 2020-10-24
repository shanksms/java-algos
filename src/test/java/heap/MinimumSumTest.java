package heap;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class MinimumSumTest {
  private MinimumSum minimumSum;

  @Before
  public void setUp() throws Exception {
    minimumSum = new MinimumSum();
  }

  @Test
  public void solve() {
    MatcherAssert.assertThat(minimumSum.solve(new int[] {6, 8, 4, 5, 2, 3}, 6), CoreMatchers.equalTo("604"));
    MatcherAssert.assertThat(minimumSum.solve(
        new int[] {1 ,1, 5, 2, 7, 6, 1, 4, 2, 3, 2, 2, 1, 6, 8, 5, 7, 6, 1, 8, 9, 2, 7, 9, 5, 4, 3, 1}, 6), CoreMatchers.equalTo("22244580134578"));

  }
}