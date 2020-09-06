package shashank.company.zeta;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class WaysToScoreRunsTest {
  private WaysToScoreRuns waysToScoreRuns;

  @Before
  public void setUp() throws Exception {
    waysToScoreRuns = new WaysToScoreRuns();
  }

  @Test
  public void waysToScoreRuns() {

    MatcherAssert.assertThat(waysToScoreRuns.waysToScoreRuns(4), CoreMatchers.equalTo(7));
  }
}