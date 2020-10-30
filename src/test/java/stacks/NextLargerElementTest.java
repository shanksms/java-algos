package stacks;

import static org.junit.Assert.*;

import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class NextLargerElementTest {
  private NextLargerElement nextLargerElement;

  @Before
  public void setUp() throws Exception {
    nextLargerElement = new NextLargerElement();
  }

  @Test
  public void solution() {
    nextLargerElement.solution(new int[]{4, 3, 2, 1});
    nextLargerElement.solution(new int[]{1, 3, 2, 4});

  }
}