package greedy;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class TwoCitySchedulingTest {
  private TwoCityScheduling twoCityScheduling;

  @Before
  public void setUp() throws Exception {
    twoCityScheduling = new TwoCityScheduling();
  }

  @Test
  public void twoCitySchedCost() {

    int [] [] input = {
        {10, 20},{30, 200}, {400, 50}, {30, 20}
    };

    MatcherAssert.assertThat(twoCityScheduling.twoCitySchedCost(input), CoreMatchers.equalTo(110));
  }
}