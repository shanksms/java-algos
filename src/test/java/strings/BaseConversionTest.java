package strings;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class BaseConversionTest {
  private BaseConversion baseConversion;

  @Before
  public void setUp() throws Exception {
    baseConversion = new BaseConversion();
  }

  @Test
  public void convertFromBaseTen() {
    MatcherAssert.assertThat(baseConversion.convertFromBaseTen(4, 2), CoreMatchers.equalTo("100"));
  }
}