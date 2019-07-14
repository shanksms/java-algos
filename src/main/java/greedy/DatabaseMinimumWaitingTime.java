package greedy;

import java.util.Collections;
import java.util.List;

/**
 * given time it takes to execute sql queries, figure out the ideal sequence of execution by Database
 * and return total time to execute
 * refer to greedy algo chapter of EPI
 */
public class DatabaseMinimumWaitingTime {

  /**
   * example input 2, 5, 1, 3
   * @return
   */
  public int minimumTotalWaitingTime(List<Integer> serviceTimes) {
    Collections.sort(serviceTimes);
    int totalWaitingTime = 0;
    for (int i = 0; i < serviceTimes.size(); i++) {
      int remainingNumberOfQueries = serviceTimes.size() - (i + 1);
      totalWaitingTime += serviceTimes.get(i) * remainingNumberOfQueries;
    }
    return totalWaitingTime;
  }

}
