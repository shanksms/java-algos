package slidingwindow;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class ContiniuosSubarrayWithGivenSumTest {

  private ContiniuosSubarrayWithGivenSum continiuosSubarrayWithGivenSum;

  @Before
  public void setUp() throws Exception {
    continiuosSubarrayWithGivenSum = new ContiniuosSubarrayWithGivenSum();
  }

  @Test
  public void solution1() {
  }

  @Test
  public void solution2() {
    int [] a = {1, 2, 3, 7, 5};
    MatcherAssert.assertThat(continiuosSubarrayWithGivenSum.solution2(a, 12), CoreMatchers
        .equalTo(new int[] {0, 3}));
  }
}