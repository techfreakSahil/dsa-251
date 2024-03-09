package Arrays.MergedIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        int[] current = intervals[0];
        int[] next = new int[2];
        for (int i = 0; i < intervals.length; i++) {
            next = i < intervals.length - 1 ? intervals[i + 1] : next;
            if (current[1] >= next[0] && i < intervals.length - 1) {
                current[1] = Math.max(next[1], current[1]);
            } else {
                ans.add(current);
                current = next;
            }
        }
        return ans.toArray(new int[0][]);
    }
}
