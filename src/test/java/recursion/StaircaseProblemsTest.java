package recursion;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class StaircaseProblemsTest {
  private StaircaseProblems staircaseProblems;

  @Before
  public void setUp() throws Exception {
    staircaseProblems = new StaircaseProblems();
  }

  @Test
  public void recursionSolution() {
    MatcherAssert.assertThat(staircaseProblems.recursionSolution(2), CoreMatchers.equalTo(2));
    MatcherAssert.assertThat(staircaseProblems.recursionSolution(3), CoreMatchers.equalTo(4));

  }
}