package Arrays.MaxSubArray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int cur_sum = nums[0];
        int max_sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur_sum = Math.max(nums[i], nums[i] + cur_sum);
            if (cur_sum > max_sum)
                max_sum = cur_sum;
        }
        return max_sum;
    }
}