package BinarySearch.StudentsReplacingChalk;

public class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        for (int i = 1; i < chalk.length; i++) {
            chalk[i] += chalk[i - 1];
        }
        k %= chalk[n - 1];
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (chalk[mid] > k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}