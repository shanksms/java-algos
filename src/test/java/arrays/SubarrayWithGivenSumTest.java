package arrays;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SubarrayWithGivenSumTest {
  private SubarrayWithGivenSum subarrayWithGivenSum;

  @Before
  public void setUp() throws Exception {
    subarrayWithGivenSum = new SubarrayWithGivenSum();
  }


  @Test
  public void maxSumSubArray() {
    List<Integer> result = subarrayWithGivenSum.maxSumSubArray(new int[]{1, 2, 3, 7, 5}, 12);
    System.out.println(result);
  }
}