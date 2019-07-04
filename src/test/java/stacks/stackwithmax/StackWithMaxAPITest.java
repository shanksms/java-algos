package stacks.stackwithmax;


import java.util.LinkedList;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class StackWithMaxAPITest {
  private StackWithMaxAPI<Integer> stackWithMaxAPI;

  @Before
  public void setUp() throws Exception {
    stackWithMaxAPI = new StackWithMaxAPI<Integer>(new LinkedList<>());
  }

  @Test
  public void push() {
  }

  @Test
  public void pop() {
  }

  @Test
  public void max() {
    stackWithMaxAPI.push(1);
    stackWithMaxAPI.push(2);
    stackWithMaxAPI.push(4);
    stackWithMaxAPI.push(4);
    int expected = 4;
    MatcherAssert.assertThat(stackWithMaxAPI.max(), CoreMatchers.equalTo(expected));
  }
}