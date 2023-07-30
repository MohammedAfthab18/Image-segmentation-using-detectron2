import java.util.Arrays;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MeetingRooms {
    public boolean canHeAttend(Interval[] intervals) {
        // Sort the intervals by start time
        Arrays.sort(intervals, (x, y) -> x.start - y.start);

        // Check for overlapping intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1].end > intervals[i].start) {
                return false;
            }
        }

        return true;
    }
}