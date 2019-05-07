package shashank.company.flipkart.coding;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
public class GameLevelTest {
    private GameLevel gameLevel;

    @Before
    public void setUp() {
        gameLevel = new GameLevel();
    }

    @Test
    public void solution() {
        List<List<String>> ls = new ArrayList<>();
        //[[X,W],[Y,W],[Z,X],[Z,Y], [U,V], [V,T]]
        List<String> l1 = new ArrayList<>();
        l1.add("X"); l1.add("W");
        List<String> l2 = new ArrayList<>();
        l2.add("Y"); l2.add("W");
        List<String> l3 = new ArrayList<>();
        l3.add("Z"); l3.add("X");
        List<String> l4 = new ArrayList<>();
        l4.add("Z"); l4.add("Y");
        List<String> l5 = new ArrayList<>();
        l5.add("U"); l5.add("V");
        List<String> l6 = new ArrayList<>();
        l6.add("V"); l5.add("T");
        ls.add(l1); ls.add(l2); ls.add(l3); ls.add(l4);

        List<String> expectedResult  = Arrays.asList("W", "Y", "X", "Z");
        System.out.println(gameLevel.solution(ls, "Z"));
        assertThat(expectedResult, equalTo(gameLevel.solution(ls, "Z")));

    }
}