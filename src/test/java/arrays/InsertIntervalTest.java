package arrays;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class InsertIntervalTest {
  private InsertInterval insertInterval;

  @Before
  public void setUp() throws Exception {
    insertInterval = new InsertInterval();
  }

  @Test
  public void insert() {

    assertArrayEquals(insertInterval.insert(new int[][]{{1, 3}, {6, 9}}, new int[] {2, 5}),
        new int[][]{{1, 5}, {6, 9}});
  }
}