package strings;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class RemoveCharToMakeAnagramTest {
  private RemoveCharToMakeAnagram sut;

  @Before
  public void setUp() throws Exception {
    sut = new RemoveCharToMakeAnagram();
  }

  @Test
  public void remAnagram() {
    int result = sut.remAnagram("bcadeh", "hea");
    MatcherAssert.assertThat(result, CoreMatchers.equalTo(3));

  }
}