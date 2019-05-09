package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * here are a total of n courses you have to take, labeled from 0 to n-1.
 *
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
 *
 * Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
 *
 * Example 1:
 *
 * Input: 2, [[1,0]]
 * Output: true
 * Explanation: There are a total of 2 courses to take.
 *              To take course 1 you should have finished course 0. So it is possible.
 * Example 2:
 *
 * Input: 2, [[1,0],[0,1]]
 * Output: false
 * Explanation: There are a total of 2 courses to take.
 *              To take course 1 you should have finished course 0, and to take course 0 you should
 *              also have finished course 1. So it is impossible.
 * Note:
 *
 * The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented.
 * You may assume that there are no duplicate edges in the input prerequisites.
 */
public class CourseSchedule {
  public boolean canFinish(int numCourses, int[][] preRequisites) {

    List[] graph = buildGraphAdjList(numCourses,  preRequisites);
    int [] inDegree = buildInDegree(numCourses,  preRequisites);

    int count = isToplogicalSortFeasible(numCourses, graph, inDegree);

    return count == numCourses;
  }

  private int isToplogicalSortFeasible(int numCourses, List[] graph, int[] inDegree) {
    Queue<Integer> queue = new LinkedList<>();
    int count = 0;
    for (int i = 0; i < numCourses; i++) {
      if (inDegree[i] == 0) queue.add(i);
    }

    while (!queue.isEmpty()) {
      int vertex = queue.poll();
      List<Integer> children = graph[vertex];
      for (int child : children) {
        inDegree[child]--;
        if (inDegree[child] == 0) queue.add(child);
      }
      count++;

    }
    return count;
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
