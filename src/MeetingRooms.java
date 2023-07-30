import java.util.Arrays;
import java.util.Comparator;

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
        // Sort the intervals by start time using Comparator.comparingInt
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval.start));

        // Check for overlapping intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1].end > intervals[i].start) {
                return false;
            }
        }

        return true;
    }
}