package recursion;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class FactorialTest {
  private Factorial factorial;

  @Test
  public void fact() {
    factorial = new Factorial();
    assertThat(factorial.fact(3), CoreMatchers.equalTo(6));
    assertThat(factorial.fact(1), CoreMatchers.equalTo(1));

  }
}