package strings;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class IntToStringConversionTest {
  private IntToStringConversion intToStringConversion;

  @Before
  public void setUp() throws Exception {
    intToStringConversion = new IntToStringConversion();
  }

  @Test
  public void toString1() {
    MatcherAssert.assertThat(intToStringConversion.toString(123), CoreMatchers.equalTo("123"));
    MatcherAssert.assertThat(intToStringConversion.toString(0), CoreMatchers.equalTo("0"));
    MatcherAssert.assertThat(intToStringConversion.toString(-123), CoreMatchers.equalTo("-123"));


  }

  @Test
  public void toInt() {
    MatcherAssert.assertThat(intToStringConversion.toInt("123"), CoreMatchers.equalTo(123));
    MatcherAssert.assertThat(intToStringConversion.toInt("-123"), CoreMatchers.equalTo(-123));

  }
}