package searching;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class MinMaxTest {
  private MinMax minMax;

  @Before
  public void setUp() throws Exception {
    minMax = new MinMax();
  }

  @Test
  public void findMinMax() {
    int [] elements = {3, 2, 5, 1, 2, 4};
    MatcherAssert.assertThat(minMax.findMinMax(elements).getMax(), CoreMatchers.equalTo(5));
    MatcherAssert.assertThat(minMax.findMinMax(elements).getMin(), CoreMatchers.equalTo(1));

  }
}