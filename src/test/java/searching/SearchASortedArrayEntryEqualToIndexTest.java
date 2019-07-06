package searching;


import java.util.Arrays;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class SearchASortedArrayEntryEqualToIndexTest {
  private SearchASortedArrayEntryEqualToIndex searchASortedArrayEntryEqualToIndex;

  @Before
  public void setUp() throws Exception {
    searchASortedArrayEntryEqualToIndex = new SearchASortedArrayEntryEqualToIndex();
  }

  @Test
  public void searchEntryEqualToItsIndex() {
    List<Integer> list = Arrays.asList(-2, 0, 2, 3, 6, 7, 8, 9);
    MatcherAssert.assertThat(searchASortedArrayEntryEqualToIndex.searchEntryEqualToItsIndex(list), CoreMatchers
        .equalTo(3));
  }
}