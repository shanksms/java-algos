package searching;


import java.util.Arrays;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class ArraySearchAlgorithmsTest {
  private ArraySearchAlgorithms arraySearchAlgorithms;

  @Before
  public void setUp() throws Exception {
    arraySearchAlgorithms = new ArraySearchAlgorithms();
  }

  @Test
  public void searchMinElementInCyclicallySortedArray() {
    List<Integer> list = Arrays.asList(10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    int expected = 3;
    MatcherAssert.assertThat(arraySearchAlgorithms.searchMinElementInCyclicallySortedArray(list), CoreMatchers
        .equalTo(expected));
  }

  @Test
  public void searchMaxElementInStrictlyAscendingThenStrictlyDescendingList() {
    List<Integer> list = Arrays.asList(10, 11, 12, 13, 5, 4, 3, 2);
    int expected = 3;
    MatcherAssert.assertThat(arraySearchAlgorithms.searchMaxElementInStrictlyAscendingThenStrictlyDescendingList(list), CoreMatchers
        .equalTo(expected));
  }

  @Test
  public void integerSquareRoot() {
    int num = 21;
    int expected = 5;
    MatcherAssert.assertThat(arraySearchAlgorithms.integerSquareRoot(num), CoreMatchers
        .equalTo(expected));
  }

}