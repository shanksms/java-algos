package graph;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class AlienDictionaryTest {
  private AlienDictionary alienDictionary;
  @Before
  public void setUp() throws Exception {
    alienDictionary = new AlienDictionary();
  }

  @Test
  public void alienOrder() {
    MatcherAssert.assertThat(alienDictionary.alienOrder(new String[] {"ri","xz","qxf","jhsguaw","dztqrbwbm","dhdqfb","jdv","fcgfsilnb","ooby"}), CoreMatchers.equalTo(""));
    MatcherAssert.assertThat(alienDictionary.alienOrder(new String[] {"w", "e"}), CoreMatchers.equalTo("we"));

  }
}