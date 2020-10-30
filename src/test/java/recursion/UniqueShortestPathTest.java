package recursion;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class UniqueShortestPathTest {
  private UniqueShortestPath uniqueShortestPath;

  @Before
  public void setUp() throws Exception {
    uniqueShortestPath = new UniqueShortestPath();
  }

  @Test
  public void solution() {
    MatcherAssert.assertThat(uniqueShortestPath.solution(new int[2][2]), CoreMatchers.equalTo(2));
  }
}