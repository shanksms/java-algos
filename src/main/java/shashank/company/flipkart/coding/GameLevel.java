package shashank.company.flipkart.coding;

import java.util.*;

/**
 * There are a total of n levels to be played in the Game.
 *
 * A player can unlock a level by first completing easier levels.
 *
 * Normal level: Completing one level will unlock only one level.
 *
 * The map of level complexity is defined as [B, A], where you need to finish level A to play level B.
 *
 *
 * Question:
 *
 *  1) Given level X, output which all levels you need to finish to unlock level X
 *
 *
 * For example:
 *
 * I) [[Y,X]]
 *
 *    There are a total of 2 levels to complete.
 *
 *    1) To choose level Y you should have finished level X.
 *
 *    2) So the correct sequence order is [X,Y]
 *
 *
 * II) [[X,W],[Y,W],[Z,X],[Z,Y], [U,V], [V,T]]
 *
 * There are a total of 4 levels to complete.
 * To play level Z you should have finished both levels X and Y.
 * Both levels X and Y should be completed after you finished level W.
 * So one correct course order is [W,X,Y,Z].
 */
public class GameLevel {

    public List<String> solution(List<List<String>> gamesDependencies, String topLevelGame) {
        Map<String, List<String>> graph = buildGraph(gamesDependencies);


        List<String> result = bfs(graph, topLevelGame);
        Collections.reverse(result);
        return result;
    }

    private List<String> bfs(Map<String, List<String>> graph, String topLevelGame) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        result.add(topLevelGame);
        visited.add(topLevelGame);
        queue.add(topLevelGame);
        while(!queue.isEmpty()) {
            String parentGame = queue.poll();
            List<String> childrenGames = graph.get(parentGame);
            if (childrenGames != null) {
                for (String gameId : childrenGames) {
                    if (!visited.contains(gameId)) {
                        result.add(gameId);
                        queue.add(gameId);
                        visited.add(gameId);
                    }
                }
            }

        }

        return result;
    }


    private Map<String, List<String>> buildGraph(List<List<String>> gamesDependencies) {
        Map<String, List<String>> graph = new HashMap<>();
        for (List<String> gamesPair : gamesDependencies) {
            if (graph.get(gamesPair.get(0)) == null) {
                List<String> tmpList = new ArrayList<>();
                graph.put(gamesPair.get(0), tmpList);
            }

            graph.get(gamesPair.get(0)).add(gamesPair.get(1));

        }

        return graph;
    }



}
