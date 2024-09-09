package LinkedList.SpiralMatrixIV;

import java.util.Arrays;

public class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][];
        for (int i = 0; i < m; i++) {
            ans[i] = new int[n];
            Arrays.fill(ans[i], -1);
        }
        int topR = 0;
        int bottomR = m - 1;
        int leftC = 0;
        int rightC = n - 1;

        while (head != null) {
            for (int i = leftC; i <= rightC && head != null; i++) {
                ans[topR][i] = head.val;
                head = head.next;
            }
            topR++;
            for (int i = topR; i <= bottomR && head != null; i++) {
                ans[i][rightC] = head.val;
                head = head.next;
            }
            rightC--;

            for (int i = rightC; i >= leftC && head != null; i--) {
                ans[bottomR][i] = head.val;
                head = head.next;
            }
            bottomR--;
            for (int i = bottomR; i >= topR && head != null; i--) {
                ans[i][leftC] = head.val;
                head = head.next;
            }
            leftC++;
        }
        return ans;
    }
}
