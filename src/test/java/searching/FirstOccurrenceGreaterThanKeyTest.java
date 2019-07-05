package searching;


import java.util.Arrays;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class FirstOccurrenceGreaterThanKeyTest {
  private FirstOccurrenceGreaterThanKey firstOccurrenceGreaterThanKey;

  @Before
  public void setUp() throws Exception {
    firstOccurrenceGreaterThanKey = new FirstOccurrenceGreaterThanKey();
  }

  @Test
  public void firstOccurrenceGreaterThanKey() {
    List<Integer> list = Arrays.asList(-14, -10, 2, 108, 108, 243, 285, 285, 285, 401);
    int expected = 9;
    MatcherAssert.assertThat(firstOccurrenceGreaterThanKey.firstOccurrenceGreaterThanKey(list, 285), CoreMatchers
        .equalTo(expected));
  }
}