package stacks;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class DecodeStringTest {
  private DecodeString decodeString;

  @Before
  public void setUp() throws Exception {
    decodeString = new DecodeString();
  }

  @Test
  public void decodeString() {
    MatcherAssert.assertThat(decodeString.decodeString("2[ab]"), CoreMatchers.equalTo("abab"));
    MatcherAssert.assertThat(decodeString.decodeString("3[a2[c]]"), CoreMatchers.equalTo("accaccacc"));

  }
}