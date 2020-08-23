package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Match {

  public boolean pathExists(List<MatchResult> matchResults, String teamA, String teamB) {

    Map<String, List<String>> graph = buildGraph(matchResults);
    return findPathBetweenTwoNodes(graph, teamA, teamB, new HashSet<>());
  }

  private boolean findPathBetweenTwoNodes(Map<String, List<String>> graph, String teamA, String teamB, Set<String> set) {
    List<String> children = graph.get(teamA);

    set.add(teamA);

    for (String child : children) {
      if (Objects.equals(child, teamB)) {
        return true;
      }
      if (!set.contains(child)) {
        return findPathBetweenTwoNodes(graph, child, teamB, set);
      }
    }


    return false;
  }

  private Map<String, List<String>> buildGraph(List<MatchResult> matchResults) {
    Map<String, List<String>> map = new HashMap<>();
    for (MatchResult matchResult : matchResults) {
      if (Objects.isNull(map.get(matchResult.team1))) {
        map.put(matchResult.team1, new ArrayList<>());
      }
      map.get(matchResult.team1).add(matchResult.team2);
    }

    return map;
  }

}

class MatchResult {
  String team1;
  String team2;

  public MatchResult(String team1, String team2) {
    this.team1 = team1;
    this.team2 = team2;
  }
}
