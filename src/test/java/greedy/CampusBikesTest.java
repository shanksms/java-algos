package greedy;



import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class CampusBikesTest {
  private CampusBikes campusBikes;

  @Before
  public void setUp() throws Exception {
    campusBikes =  new CampusBikes();
  }

  @Test
  public void assignBikes() {
    int [] [] workers =   {
        {0,0},
        {2,1}
    };

    int [] [] bikes = {
        {1, 2},
        {3, 3}
    };

    MatcherAssert.assertThat(campusBikes.assignBikes(workers, bikes), CoreMatchers.equalTo(new int[]{1, 0}));
  }
}