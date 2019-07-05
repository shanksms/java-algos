package searching;


import java.util.Arrays;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class FirstOccurrenceOfKInASortedArrayTest {
  private FirstOccurrenceOfKInASortedArray firstOccurrenceOfKInASortedArray;

  @Before
  public void setUp() throws Exception {
    firstOccurrenceOfKInASortedArray = new FirstOccurrenceOfKInASortedArray();
  }

  @Test
  public void firstOccurrence() {
    List<Integer> list = Arrays.asList(-14, -10, 2, 108, 108, 243, 285, 285, 285, 401);
    int expected = 6;
    MatcherAssert.assertThat(firstOccurrenceOfKInASortedArray.firstOccurrence(list, 285), CoreMatchers
        .equalTo(expected));
  }
}