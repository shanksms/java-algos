package shashank.company.gs;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class MaxAvgScoreTest {
  private MaxAvgScore maxAvgScore;

  @Before
  public void setUp() throws Exception {
    maxAvgScore = new MaxAvgScore();
  }

  @Test
  public void findMaxAvgScore() {
    String[][] arr = {
      {"John", "70"},
      {"Michael", "60"}
    };

    MatcherAssert.assertThat(maxAvgScore.findMaxAvgScore(arr), CoreMatchers.equalTo(70));
  }
}