package recursion;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class GCDTest {
  GCD gcd;

  @Before
  public void setUp() throws Exception {
    gcd = new GCD();
  }

  @Test
  public void gcdRecursive() {
    MatcherAssert.assertThat(gcd.gcdRecursive(10, 15), CoreMatchers.equalTo(5));
  }
}