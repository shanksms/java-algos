package arrays;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class SearchInTwoDMatrixTest {
  private SearchInTwoDMatrix searchInTwoDMatrix;

  @Before
  public void setUp() throws Exception {
    searchInTwoDMatrix = new SearchInTwoDMatrix();
  }

  @Test
  public void searchMatrix() {
    int [] [] matrix = {
                        {1,   3,  5,  7},
                        {10, 11, 16, 20},
                        {23, 30, 34, 50}
                      };
    assertThat(searchInTwoDMatrix.searchMatrix(matrix, 16), equalTo(true));
  }
}