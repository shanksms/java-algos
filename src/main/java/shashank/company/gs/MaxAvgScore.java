package shashank.company.gs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxAvgScore {

  public Integer findMaxAvgScore(String [] [] scores) {

    Map<String, List<Integer>> nameScoresMap = new HashMap<>();

    for (String [] score : scores) {
      if (nameScoresMap.get(score[0]) == null) {
        nameScoresMap.put(score[0], new ArrayList<>());
      }
      nameScoresMap.get(score[0]).add(Integer.parseInt(score[1]));

    }

    Integer maxAvg = Integer.MIN_VALUE;
    for (Map.Entry<String, List<Integer>> entry : nameScoresMap.entrySet()) {
      Integer currentAvg = entry.getValue().stream().mapToInt(e -> e).sum() / entry.getValue().size();
      maxAvg = maxAvg > currentAvg ? maxAvg : currentAvg;
    }

    return maxAvg;
  }

}
