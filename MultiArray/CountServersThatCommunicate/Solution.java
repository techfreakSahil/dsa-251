package MultiArray.CountServersThatCommunicate;

public class Solution {
    public int countServers(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[] rowC = new int[r];
        int[] colC = new int[c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    rowC[i]++;
                    colC[j]++;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1 && (rowC[i] > 1 || colC[j] > 1)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}