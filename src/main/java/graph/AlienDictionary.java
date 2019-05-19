package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 *There is a new alien language which uses the latin alphabet. However, the order among letters are unknown to you. You receive a list of non-empty words from the dictionary, where words are sorted lexicographically by the rules of this new language. Derive the order of letters in this language.
 *
 * Example 1:
 *
 * Input:
 * [
 *   "wrt",
 *   "wrf",
 *   "er",
 *   "ett",
 *   "rftt"
 * ]
 *
 * Output: "wertf"
 * Example 2:
 *
 * Input:
 * [
 *   "z",
 *   "x"
 * ]
 *
 * Output: "zx"
 * Example 3:
 *
 * Input:
 * [
 *   "z",
 *   "x",
 *   "z"
 * ]
 *
 * Output: ""
 *
 * Explanation: The order is invalid, so return "".
 * Note:
 *
 * You may assume all letters are in lowercase.
 * You may assume that if a is a prefix of b, then a must appear before b in the given dictionary.
 * If the order is invalid, return an empty string.
 * There may be multiple valid order of letters, return any one of them is fine.
 * https://github.com/awangdev/LintCode/blob/master/Java/Alien%20Dictionary.java
 *
 */
public class AlienDictionary {
  public String alienOrder(String[] words) {
    if (words == null || words.length == 0) return "";

    // Build graph && indegree map
    Map<Character, List<Character>> graph = new HashMap<>();
    Map<Character, Integer> inDegree = new HashMap<>();

    build(words, graph, inDegree);

    String result = sortToplogically(graph, inDegree);

    return result;
  }

  private String sortToplogically(Map<Character, List<Character>> graph , Map<Character, Integer> inDegree) {
    //add nodes with 0 indegree
    Queue<Character> queue =  inDegree.entrySet().stream()
        .filter(e -> e.getValue() == 0)
        .map(e -> e.getKey())
        .collect(Collectors.toCollection(() -> new LinkedList<>())
    );


    StringBuilder sb = new StringBuilder();
    while (!queue.isEmpty()) {
      Character node = queue.poll();
      List<Character> children = graph.getOrDefault(node, new ArrayList<>());
      for (Character ch : children) {
        inDegree.put(ch, inDegree.get(ch) - 1);
        if (inDegree.get(ch) == 0) queue.add(ch);
      }
      sb.append(node + "");

    }
    if (sb.length() != graph.size()) return "";
    return sb.toString();
  }

  private  void build(String[] words, Map<Character, List<Character>> graph , Map<Character, Integer> inDegree) {

    for (String word : words) {
        for(int i = 0; i < word.length(); i++) {
          inDegree.putIfAbsent(word.charAt(i), 0);
          graph.putIfAbsent(word.charAt(i), new ArrayList<>());

        }
    }

    for (int i = 0; i < words.length - 1; i++) {
      int index = 0;
      while (index < words[i].length() && index < words[i + 1].length()) {
        if (words[i].charAt(index) != words[i + 1].charAt(index)) {
            graph.get(words[i].charAt(index)).add(words[i + 1].charAt(index));

          inDegree.put(
              words[i + 1].charAt(index),
              inDegree.getOrDefault(words[i + 1].charAt(index), 0) + 1
          );
          break;
        }
        index++;
      }
    }
  }

}
