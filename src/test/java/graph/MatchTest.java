package graph;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class MatchTest {
  private Match match;

  @Before
  public void setUp() throws Exception {
    match = new Match();
  }

  @Test
  public void pathExists() {
    MatchResult matchResult1 = new MatchResult("A", "B");
    MatchResult matchResult2 = new MatchResult("B", "C");

    MatcherAssert.assertThat(match.pathExists(Arrays.asList(matchResult1, matchResult2), "A", "C"),
        CoreMatchers.equalTo(true));

  }
}