package recursion;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class TotalNumberOfCharactersAcrossStringsTest {
  private TotalNumberOfCharactersAcrossStrings totalNumberOfCharactersAcrossStrings;

  @Before
  public void setUp() throws Exception {
    totalNumberOfCharactersAcrossStrings = new TotalNumberOfCharactersAcrossStrings();
  }

  @Test
  public void recursiveSolution() {
    MatcherAssert.assertThat(totalNumberOfCharactersAcrossStrings.recursiveSolution(new String[]{"ab", "cd", "ef"}), CoreMatchers
        .equalTo(6));
  }
}