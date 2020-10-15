package trie;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class TrieTest {

  private Trie trie;

  @Before
  public void setUp() throws Exception {
    trie =  new Trie();
  }

  @Test
  public void insert() {
  }

  @Test
  public void startsWith() {
    trie.insert("shashank");
    MatcherAssert.assertThat(trie.startsWith("sha"), CoreMatchers.equalTo(true));
    MatcherAssert.assertThat(trie.startsWith(""), CoreMatchers.equalTo(false));

  }
}