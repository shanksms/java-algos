package arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class SearchInTwoDMatrix2Test {
  private SearchInTwoDMatrix2 searchInTwoDMatrix2;

  @Before
  public void setUp() throws Exception {
    searchInTwoDMatrix2 = new SearchInTwoDMatrix2();
  }

  @Test
  public void searchMatrix() {
    int [][] ipArray = {
        {1,   4,  7, 11, 15},
        {2,   5,  8, 12, 19},
        {3,   6,  9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}
      };

    assertThat(searchInTwoDMatrix2.searchMatrix(ipArray, 9), equalTo(true));
    assertThat(searchInTwoDMatrix2.searchMatrix(ipArray, 20), equalTo(false));

  }
}