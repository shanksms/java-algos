package searching;

/**
 * https://leetcode.com/problems/koko-eating-bananas/
 * Koko loves to eat bananas.  There are N piles of bananas, the i-th pile has piles[i] bananas.  The guards have gone and will come back in H hours.
 *
 * Koko can decide her bananas-per-hour eating speed of K.  Each hour, she chooses some pile of bananas, and eats K bananas from that pile.  If the pile has less than K bananas, she eats all of them instead, and won't eat any more bananas during this hour.
 *
 * Koko likes to eat slowly, but still wants to finish eating all the bananas before the guards come back.
 *
 * Return the minimum integer K such that she can eat all the bananas within H hours.
 *
 */
public class MinEatingSpeed {

  public int minEatingSpeed(int[] piles, int H) {

    //understand why low is starting from 1 and not 0
    /**
     * following input will fail if we take low = 0
     * new MinEatingSpeed().minEatingSpeed(new int[]{312884470
     *     },968709470 );
     */
    int low = 1; int high = 1_000_000_000;

    while (low < high) {
      int mid = low + (high - low) / 2;
      if (!canEat(piles, H, mid)) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;

  }
  private boolean canEat(int [] piles, int H, int K) {
    int time = 0;
    for (int pile : piles) {
      time += (pile - 1) / K + 1;
    }
    return time <= H;
  }

  public static void main(String[] args) {
    new MinEatingSpeed().minEatingSpeed(new int[]{312884470
    },968709470 );
  }

}
