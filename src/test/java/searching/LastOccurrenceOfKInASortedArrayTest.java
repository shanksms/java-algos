package searching;


import java.util.Arrays;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class LastOccurrenceOfKInASortedArrayTest {
  private LastOccurrenceOfKInASortedArray lastOccurrenceOfKInASortedArray;

  @Before
  public void setUp() throws Exception {
    lastOccurrenceOfKInASortedArray  = new LastOccurrenceOfKInASortedArray();
  }

  @Test
  public void lastOccurrence() {
    List<Integer> list = Arrays.asList(-14, -10, 2, 108, 108, 243, 285, 285, 285, 401);
    int expected = 8;
    MatcherAssert
        .assertThat(lastOccurrenceOfKInASortedArray.lastOccurrence(list, 285), CoreMatchers
        .equalTo(expected));

  }
}