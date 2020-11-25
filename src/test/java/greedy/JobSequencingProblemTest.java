package greedy;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class JobSequencingProblemTest {
  private JobSequencingProblem jobSequencingProblem;

  @Before
  public void setUp() throws Exception {
    jobSequencingProblem = new JobSequencingProblem();
  }

  @Test
  public void solution() {
    int [] [] input = {{1,4,20}, {2,1,10}, {3,1,40}, {4,1,30}};
    MatcherAssert.assertThat(jobSequencingProblem.solution(input), CoreMatchers.equalTo(60));
  }
}