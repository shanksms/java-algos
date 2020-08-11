package hash;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class AnagramsTuplesTest {

  private AnagramsTuples anagramsTuples;
  @Before
  public void setUp() throws Exception {
    anagramsTuples = new AnagramsTuples();
  }

  @Test
  public void findAnagrams() {
    List<String> list = Arrays.asList("debitcard", "badcredit", "abc");
    List<List<String>> expected = Arrays.asList(Arrays.asList("debitcard", "badcredit"));

    MatcherAssert.assertThat(anagramsTuples.findAnagrams(list), CoreMatchers.equalTo(expected));
  }
}