package MultiArray.SetMatrixZeroes;

import java.util.Arrays;

public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] a = new int[m];
        int[] b = new int[n];
        Arrays.fill(a, -1);
        Arrays.fill(b, -1);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    a[i] = 0;
                    b[j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == 0 || b[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
