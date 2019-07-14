package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given list of task Durations, you need to assign pair of tasks to a worker so that
 * total time to complete all the tasks can be minimized.
 * e.g. input = [5, 2, 1, 6, 4, 4]
 * optimum assigmnent = (1, 6), (2, 5), (4, 4)
 *  * refer to greedy algo chapter of EPI
 */
public class OptimumTaskAssignment {

  /**
   *
   * @param tasksDurations
   * @return
   */
  public List<TaskPair> assignTasks(List<Integer> tasksDurations) {
    Collections.sort(tasksDurations);
    List<TaskPair> taskPairs = new ArrayList<>();
    int start = 0; int end = tasksDurations.size() - 1;
    while(start < end) {
      taskPairs.add(new TaskPair(tasksDurations.get(start), tasksDurations.get(end)));
      start++;
      end++;
    }


    return taskPairs;
  }
}

class TaskPair {
  public int task1;
  public int task2;

  public TaskPair(int task1, int task2) {
    this.task1 = task1;
    this.task2 = task2;
  }
}
