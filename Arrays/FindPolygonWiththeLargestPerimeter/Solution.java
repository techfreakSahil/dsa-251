package Arrays.FindPolygonWiththeLargestPerimeter;

import java.util.Arrays;

class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long[] sum = new long[nums.length];
        long cur_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum[i] = cur_sum;
            cur_sum += nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < sum[i]) {
                return nums[i] + sum[i];
            }
        }
        return -1;
    }
}