package bst;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class TopKElementsTest {

  private TopKElements topKElements;
  @Before
  public void setUp() throws Exception {
    topKElements = new TopKElements();
  }

  @Test
  public void findTopKElements() {
    BSTNode<Integer> left = new BSTNode<>(1, null, null);
    BSTNode<Integer> right = new BSTNode<>(3, null, null);
    BSTNode<Integer> root = new BSTNode<>(2, left, right);

    MatcherAssert.assertThat(topKElements.findTopKElements(root, 3), CoreMatchers.equalTo(
        Arrays.asList(3, 2, 1)));
  }
}