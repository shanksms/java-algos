package searching;


import java.util.Arrays;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
  private BinarySearch binarySearch;

  @Before
  public void setUp() throws Exception {
    binarySearch = new BinarySearch();
  }

  @Test
  public void search() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    int expectedResult = 2;
    MatcherAssert.assertThat(binarySearch.search(3, list), CoreMatchers.equalTo(2));
  }
}