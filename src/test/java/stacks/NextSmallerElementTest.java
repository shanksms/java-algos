package stacks;

import static org.junit.Assert.*;

import java.util.Collection;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class NextSmallerElementTest {
  private NextSmallerElement nextSmallerElement;

  @Before
  public void setUp() throws Exception {
    nextSmallerElement = new NextSmallerElement();
  }

  @Test
  public void solution() {

    MatcherAssert.assertThat(nextSmallerElement.solution(new int[]{13, 7, 6, 12}), CoreMatchers.hasItems(7, 6, -1, -1));
    MatcherAssert.assertThat(nextSmallerElement.solution(new int[]{4, 3, 2, 1}), CoreMatchers.hasItems(-1, -1, -1, -1));

  }
}