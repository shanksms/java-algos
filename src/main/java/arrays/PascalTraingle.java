package arrays;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *          1
 *         1 1
 *        1 2 1
 *       1 3 3 1
 *      1 4 6 4 1
 *      return pascal traingle as a list of list.
 *
 */
public class PascalTraingle {

    public List<List<Integer>> generatePascalTraingle(int rowNum) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> row = null;
        for (int i = 0; i < rowNum; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
            }
            lists.add(row);
        }


        return lists;
    }

}
