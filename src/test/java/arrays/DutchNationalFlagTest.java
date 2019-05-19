package arrays;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class DutchNationalFlagTest {
  private DutchNationalFlag dutchNationalFlag;
  @Before
  public void setUp() throws Exception {
    dutchNationalFlag = new DutchNationalFlag();
  }

  @Test
  public void sortColors() {
    int [] nums = {2,0,2,1,1,0};
    dutchNationalFlag.sortColors(nums);
    MatcherAssert.assertThat(nums, CoreMatchers.equalTo(new int[] {0, 0, 1, 1, 2, 2}));
  }
}