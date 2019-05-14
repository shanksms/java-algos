package arrays;


import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
public class MeetingRoomsTest {
  private MeetingRooms meetingRooms;

  @Before
  public void setUp() throws Exception {
    meetingRooms = new MeetingRooms();
  }

  @Test
  public void canAttendMeetings_yes() {
    Interval [] intervals = buildIntervalsForPositiveCase();
    assertThat(meetingRooms.canAttendMeetings(intervals), equalTo(true));

  }

  private Interval[] buildIntervalsForPositiveCase() {
    //[[7,10],[2,4]]
    Interval interval1 = new Interval(7, 10);
    Interval interval2 = new Interval(2, 4);
    return new Interval[]{interval1, interval2};

  }
}