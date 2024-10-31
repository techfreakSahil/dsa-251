package DP.RobotAndFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, Comparator.comparingInt(a -> a[0]));
        ArrayList<Integer> pos = new ArrayList<>();
        for (int f[] : factory) {
            for (int i = 0; i < f[1]; i++) {
                pos.add(f[0]);
            }
        }
        long dp[][] = new long[robot.size() + 1][pos.size() + 1];
        for (int i = 0; i < robot.size(); i++) {
            dp[i][pos.size()] = (long) 1e12;
        }
        for (int i = robot.size() - 1; i >= 0; i--) {
            for (int j = pos.size() - 1; j >= 0; j--) {
                long pick = Math.abs(robot.get(i) - pos.get(j)) + dp[i + 1][j + 1];
                long notPick = dp[i][j + 1];
                dp[i][j] = Math.min(pick, notPick);
            }
        }
        return dp[0][0];
    }
}
