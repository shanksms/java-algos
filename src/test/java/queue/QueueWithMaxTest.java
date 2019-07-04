package queue;


import java.util.ArrayDeque;
import java.util.LinkedList;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueWithMaxTest {
  private QueueWithMax<Integer> queue;

  @Before
  public void setUp() throws Exception {
    queue = new QueueWithMax<Integer>(new LinkedList<>(), new LinkedList<>());
  }

  @Test
  public void enqueue() {
  }

  @Test
  public void dequeue() {
  }

  @Test
  public void max() {
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.dequeue();

    Integer expectedMax = 3;
    MatcherAssert.assertThat(queue.max(), CoreMatchers.equalTo(expectedMax));

  }
}