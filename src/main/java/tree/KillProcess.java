package tree;

import java.util.*;

/**
 * Given n processes, each process has a unique PID (process id) and its PPID (parent process id).
 *
 * Each process only has one parent process, but may have one or more children processes. This is just like a tree structure. Only one process has PPID that is 0, which means this process has no parent process. All the PIDs will be distinct positive integers.
 *
 * We use two list of integers to represent a list of processes, where the first list contains PID for each process and the second list contains the corresponding PPID.
 *
 * Now given the two lists, and a PID representing a process you want to kill, return a list of PIDs of processes that will be killed in the end. You should assume that when a process is killed, all its children processes will be killed. No order is required for the final answer.
 *
 * Example 1:
 * Input:
 * pid =  [1, 3, 10, 5]
 * ppid = [3, 0, 5, 3]
 * kill = 5
 * Output: [5,10]
 * Explanation:
 *            3
 *          /   \
 *         1     5
 *              /
 *             10
 * Kill 5 will also kill 10.
 * Note:
 * The given kill id is guaranteed to be one of the given PIDs.
 * n >= 1.
 */
public class KillProcess {

    class Process {
        int id;
        List<Process> children = new ArrayList<>();
    }
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        //build tree
        Map<Integer, Process> tree = new HashMap<>();
        for (int id : pid) {
            Process process = new Process();
            process.id = id;
            tree.put(id, process);
        }

        for (int i = 0; i < ppid.size(); i++) {
            if (ppid.get(i) > 0) {
                Process parentProcess = tree.get(ppid.get(i));
                parentProcess.children.add(tree.get(pid.get(i)));

            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(kill);
        return findResult(tree.get(kill), result);
    }

    private List<Integer> findResult(Process process, List<Integer> result) {

        for (Process child : process.children) {
            result.add(child.id);
            findResult(child, result);

        }

        return result;
    }


}
