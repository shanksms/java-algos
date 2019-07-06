package arrays;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class MissingNumberTest {
  private MissingNumber missingNumber;

  @Before
  public void setUp() throws Exception {
    missingNumber = new MissingNumber();
  }

  @Test
  public void missingNumberMathApproach() {
    int [] a = {0, 1, 2};
    int expected = 3;
    MatcherAssert.assertThat(missingNumber.missingNumberMathApproach(a), CoreMatchers.equalTo(expected));
  }
}