package arrays;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class MinimumDominoRotationsTest {
  private MinimumDominoRotations minimumDominoRotations;
  @Before
  public void setUp() {
    minimumDominoRotations = new MinimumDominoRotations();
  }

  @Test
  public void minDominoRotations() {
    int A [] = {2, 1, 2, 4, 2, 2};
    int B [] = {5, 2, 6, 2 ,3 ,2};

    MatcherAssert.assertThat(minimumDominoRotations.minDominoRotations(A, B), CoreMatchers.equalTo(2));
  }
}