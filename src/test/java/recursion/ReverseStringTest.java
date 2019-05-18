package recursion;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {
  private ReverseString reverseString;

  @Before
  public void setUp() throws Exception {
    reverseString = new ReverseString();
  }

  @Test
  public void reverseString() {
    MatcherAssert.assertThat(reverseString.reverseString("abc"), CoreMatchers.equalTo("cba"));
  }
}