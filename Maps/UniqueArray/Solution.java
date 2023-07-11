package Maps.UniqueArray;

import java.util.Arrays;

public class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                int change = nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
                ans += change;
            }
        }
        return ans;
    }
}