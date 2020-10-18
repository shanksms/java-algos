package queue;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class FirstNonRepeatingCharacterInAStreamTest {

  private FirstNonRepeatingCharacterInAStream firstNonRepeatingCharacterInAStream;

  @Before
  public void setUp() throws Exception {
    firstNonRepeatingCharacterInAStream = new FirstNonRepeatingCharacterInAStream();
  }



  @Test
  public void returnFirstNonRepeatingCharacter() {
    /*MatcherAssert.assertThat(firstNonRepeatingCharacterInAStream.returnFirstNonRepeatingCharacter('a'), CoreMatchers
        .equalTo("a"));
    MatcherAssert.assertThat(firstNonRepeatingCharacterInAStream.returnFirstNonRepeatingCharacter('a'), CoreMatchers
        .equalTo("-1"));
    MatcherAssert.assertThat(firstNonRepeatingCharacterInAStream.returnFirstNonRepeatingCharacter('b'), CoreMatchers
        .equalTo("b"));
    MatcherAssert.assertThat(firstNonRepeatingCharacterInAStream.returnFirstNonRepeatingCharacter('c'), CoreMatchers
        .equalTo("b"));*/

    MatcherAssert.assertThat(firstNonRepeatingCharacterInAStream.returnFirstNonRepeatingCharacter('a'), CoreMatchers
        .equalTo("a"));
    MatcherAssert.assertThat(firstNonRepeatingCharacterInAStream.returnFirstNonRepeatingCharacter('a'), CoreMatchers
        .equalTo("-1"));
    MatcherAssert.assertThat(firstNonRepeatingCharacterInAStream.returnFirstNonRepeatingCharacter('c'), CoreMatchers
        .equalTo("c"));

  }
}
