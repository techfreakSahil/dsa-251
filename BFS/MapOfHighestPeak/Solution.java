package BFS.MapOfHighestPeak;

import java.util.*;

public class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { 1, -1, 0, 0 };
        int rows = isWater.length;
        int cols = isWater[0].length;
        int[][] heights = new int[rows][cols];
        for (int[] row : heights) {
            Arrays.fill(row, -1);
        }
        Queue<int[]> queue = new LinkedList<>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (isWater[row][col] == 1) {
                    queue.add(new int[] { row, col });
                    heights[row][col] = 0;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentRow = current[0];
            int currentCol = current[1];
            for (int i = 0; i < 4; i++) {
                int neighborRow = currentRow + dx[i];
                int neighborCol = currentCol + dy[i];
                if (isValid(neighborRow, neighborCol, rows, cols) && heights[neighborRow][neighborCol] == -1) {
                    heights[neighborRow][neighborCol] = heights[currentRow][currentCol] + 1;
                    queue.add(new int[] { neighborRow, neighborCol });
                }
            }
        }

        return heights;
    }

    private boolean isValid(int row, int col, int rows, int cols) {
        return row >= 0 && col >= 0 && row < rows && col < cols;
    }
}
