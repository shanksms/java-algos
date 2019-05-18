package recursion;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class SumOfNaturalNumbersTest {
  private SumOfNaturalNumbers sumOfNaturalNumbers;

  @Before
  public void setUp() throws Exception {
    sumOfNaturalNumbers = new SumOfNaturalNumbers();
  }

  @Test
  public void sum() {

    MatcherAssert.assertThat(sumOfNaturalNumbers.sum(3), CoreMatchers.equalTo(6));
  }
}