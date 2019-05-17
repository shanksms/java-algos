package arrays;


import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FirstAndLastPositionInSortedArrayTest {
  private FirstAndLastPositionInSortedArray firstAndLastPositionInSortedArray;

  @Before
  public void setUp() throws Exception {
    firstAndLastPositionInSortedArray = new FirstAndLastPositionInSortedArray();
  }

  @Test
  public void searchRange_numberExist() {
    int [] nums = {5,7,7,8,8,10};
    assertThat(firstAndLastPositionInSortedArray.searchRange(nums, 7), equalTo(new int[] {1, 2}));
  }
  @Test
  public void searchRange_numberDoesExist() {
    int [] nums = {5,7,7,8,8,10};
    assertThat(firstAndLastPositionInSortedArray.searchRange(nums, 6), equalTo(new int[] {-1, -1}));
  }
}