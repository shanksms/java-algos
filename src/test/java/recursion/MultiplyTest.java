package recursion;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class MultiplyTest {

  private Multiply multiply;
  @Before
  public void setUp() throws Exception {
    multiply = new Multiply();
  }

  @Test
  public void multiply() {
    MatcherAssert.assertThat(multiply.multiply(3, 2), CoreMatchers.equalTo(6));
    MatcherAssert.assertThat(multiply.multiply(0, 2), CoreMatchers.equalTo(0));

  }
}