package Arrays.DuplicateNumber;

public class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] ans = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (ans[nums[i]]) {
                return nums[i];
            }
            ans[nums[i]] = true;
        }
        return -1;
    }
}
