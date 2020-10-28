package searching;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class MAxNoOfOnesTest {
  private MAxNoOfOnes mAxNoOfOnes;

  @Before
  public void setUp() throws Exception {
    mAxNoOfOnes = new MAxNoOfOnes();
  }

  @Test
  public void rowWithMax1s() {
    int [] [] input = {
        {0, 1, 1, 1},
        {0, 0, 1, 1},
        {0, 0, 0, 0},
        {1, 1, 1, 1}
    };
    MatcherAssert.assertThat(mAxNoOfOnes.rowWithMax1s(input,4, 4), CoreMatchers.equalTo(3));
  }

  @Test
  public void betterSolution() {
    int [] [] input = {
        {0, 1, 1, 1},
        {0, 0, 1, 1},
        {0, 0, 0, 0},
        {1, 1, 1, 1}
    };
    MatcherAssert.assertThat(mAxNoOfOnes.betterSolution(input,4, 4), CoreMatchers.equalTo(3));

  }
}