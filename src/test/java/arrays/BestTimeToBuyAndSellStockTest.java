package arrays;


import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BestTimeToBuyAndSellStockTest {
  private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

  @Before
  public void setUp() throws Exception {
    bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
  }

  @Test
  public void maxProfitFound() {
    int [] prices = {7,1,5,3,6,4};
    assertThat(bestTimeToBuyAndSellStock.maxProfit(prices), equalTo(5));

  }
  @Test
  public void maxProfitNotFound() {
    int [] prices = {7,6,4,3,1};
    assertThat(bestTimeToBuyAndSellStock.maxProfit(prices), equalTo(0));

  }
}