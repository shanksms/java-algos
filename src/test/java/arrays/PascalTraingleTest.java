package arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class PascalTraingleTest {
    private PascalTraingle pascalTraingle;

    @Before
    public void setUp() {
        pascalTraingle = new PascalTraingle();
    }
    @Test
    public void generatePascalTraingle() {
        List<List<Integer>> expected =
                Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1));
        int rows = 2;
        assertThat(pascalTraingle.generatePascalTraingle(rows), equalTo(expected));

    }
}