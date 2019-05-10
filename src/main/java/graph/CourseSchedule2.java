package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule2 {
  public int [] findOrder(int numCourses, int[][] preRequisites) {

    List[] graph = buildGraphAdjList(numCourses,  preRequisites);
    int [] inDegree = buildInDegree(numCourses,  preRequisites);

    Integer [] order  = isToplogicalSortFeasible(numCourses, graph, inDegree);
    int [] finalResult = new int[order.length];
    for (int i = 0; i < order.length; i++) finalResult[i] = order[i];

    return finalResult;
  }

  private Integer [] isToplogicalSortFeasible(int numCourses, List[] graph, int[] inDegree) {
    Queue<Integer> queue = new LinkedList<>();
    int count = 0;
    for (int i = 0; i < numCourses; i++) {
      if (inDegree[i] == 0) queue.add(i);
    }
    List<Integer> result = new ArrayList<>();
    while (!queue.isEmpty()) {
      int vertex = queue.poll();
      List<Integer> children = graph[vertex];
      for (int child : children) {
        inDegree[child]--;
        if (inDegree[child] == 0) queue.add(child);
      }
      result.add(vertex);
      count++;

    }
    if (count != numCourses) return new Integer[0];
    return result.stream().toArray(Integer[]::new);
  }

  private int[] buildInDegree(int numCourses, int[][] preRequisites) {
    int [] inDegree = new int[numCourses];
    for (int i = 0; i < preRequisites.length; i++) {
      inDegree[preRequisites[i][0]]++;
    }

    return inDegree;
  }

  private List[] buildGraphAdjList(int numCourses, int[][] preRequisites) {
    List [] graph = new ArrayList[numCourses];
    for (int i = 0; i < numCourses; i++) {
      graph[i] = new ArrayList();
    }
    for (int [] preRequisite : preRequisites) {
      graph[preRequisite[1]].add(preRequisite[0]);
    }

    return graph;
  }


}
