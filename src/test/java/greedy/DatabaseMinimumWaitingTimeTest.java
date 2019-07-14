package greedy;


import java.util.Arrays;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class DatabaseMinimumWaitingTimeTest {
  private DatabaseMinimumWaitingTime databaseMinimumWaitingTime;

  @Before
  public void setUp() throws Exception {
    databaseMinimumWaitingTime = new DatabaseMinimumWaitingTime();
  }

  @Test
  public void minimumTotalWaitingTime() {
    List<Integer> queryTimes = Arrays.asList(2, 5, 1, 3);
    /**
     * 0 + (1) + (1 + 2) + (1 + 2 + 3)
     */
    int expected = 10;
    MatcherAssert.assertThat(databaseMinimumWaitingTime.minimumTotalWaitingTime(queryTimes), CoreMatchers
        .equalTo(expected));

  }
}