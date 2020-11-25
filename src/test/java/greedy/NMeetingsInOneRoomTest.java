package greedy;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class NMeetingsInOneRoomTest {
  private NMeetingsInOneRoom nMeetingsInOneRoom;

  @Before
  public void setUp() throws Exception {
    nMeetingsInOneRoom = new NMeetingsInOneRoom();
  }

  @Test
  public void solution() {

    int [] [] input ={{1, 2}, {3, 4}, {0, 6}, {5, 7}, {8, 9}, {5, 9}};

    MatcherAssert.assertThat(nMeetingsInOneRoom.solution(input), CoreMatchers.equalTo(4));
  }
}