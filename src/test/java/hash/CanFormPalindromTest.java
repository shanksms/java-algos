package hash;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class CanFormPalindromTest {
  private CanFormPalindrom canFormPalindrom;

  @Before
  public void setUp() throws Exception {
    canFormPalindrom = new CanFormPalindrom();
  }

  @Test
  public void canFormPalindrom() {
    MatcherAssert.assertThat(canFormPalindrom.canFormPalindrom("aab"), CoreMatchers.equalTo(true));
  }
}