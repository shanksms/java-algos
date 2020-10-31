package stacks;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class CelebrityProblemTest {

  private CelebrityProblem celebrityProblem;

  @Before
  public void setUp() throws Exception {
    celebrityProblem =  new CelebrityProblem();
  }

  @Test
  public void solution() {
    // Person with 2 is celebrity
     int MATRIX1[][] = { { 0, 0, 1, 0 },
        { 0, 0, 1, 0 },
        { 0, 0, 0, 0 },
        { 0, 0, 1, 0 } };
    MatcherAssert.assertThat(celebrityProblem.solution(MATRIX1, 4), CoreMatchers.equalTo(2));
    int MATRIX2[][] = { { 0, 0 },
      { 0, 0},
     };
    MatcherAssert.assertThat(celebrityProblem.solution(MATRIX2, 2), CoreMatchers.equalTo(-1));

  }

  @Test
  public void graphSolution() {
    int MATRIX1[][] = { { 0, 0, 1, 0 },
        { 0, 0, 1, 0 },
        { 0, 0, 0, 0 },
        { 0, 0, 1, 0 } };
    MatcherAssert.assertThat(celebrityProblem.graphSolution(MATRIX1, 4), CoreMatchers.equalTo(2));
    int MATRIX2[][] = { { 0, 0 },
        { 0, 0},
    };
    MatcherAssert.assertThat(celebrityProblem.graphSolution(MATRIX2, 2), CoreMatchers.equalTo(-1));
  }
}