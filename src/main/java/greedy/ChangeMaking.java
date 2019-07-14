package greedy;

/**
 * US currency can take 1, 5, 10, 25, 50, 100 cents
 * given cents value as input, return number of coins.
 */
public class ChangeMaking {

  public int changeMaking(int cents) {
    int [] COINS = {100, 50, 25, 10, 5, 1};

    int count = 0;
    for (int coinVal : COINS) {
      count += cents / coinVal;
      cents = cents % coinVal;
    }
    return count;
  }

}
