package heap;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class KSortedArrayCleanWayTest {

  private KSortedArrayCleanWay kSortedArrayCleanWay;
  @Before
  public void setUp() throws Exception {
    kSortedArrayCleanWay = new KSortedArrayCleanWay();
  }

  @Test
  public void mergeSortedArrays() {
    List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 4),  Arrays.asList(2, 3));
    MatcherAssert.assertThat(kSortedArrayCleanWay.mergeSortedArrays(lists), CoreMatchers.equalTo(Arrays.asList(1, 2, 3,4 )));

  }
}