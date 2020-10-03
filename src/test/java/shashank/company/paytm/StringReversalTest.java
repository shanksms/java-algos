package shashank.company.paytm;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class StringReversalTest {
  private StringReversal stringReversal;

  @Before
  public void setUp() throws Exception {
    stringReversal = new StringReversal();
  }

  @Test
  public void reverse() {
    MatcherAssert.assertThat(stringReversal.reverse("a(bc)d"), CoreMatchers.equalTo("acbd"));
    MatcherAssert.assertThat(stringReversal.reverse("(a(bc)d)"), CoreMatchers.equalTo("dbca"));

  }
}