package arrays;


import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class LeftRotationTest {

  private LeftRotation leftRotation;
  @Before
  public void setUp() throws Exception {
    leftRotation = new LeftRotation();
  }

  @Test
  public void rotLeft() {
    int rotateLeftBy = 1;
    int [] input = {1, 2, 3, 4};
    int [] output = {2, 3, 4, 1};
    assertThat(leftRotation.rotLeft(input, rotateLeftBy), equalTo(output));

  }
}