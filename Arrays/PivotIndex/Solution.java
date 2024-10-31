package Arrays.PivotIndex;

public class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int leftSum = 0, rightSum = 0, ans = -1;
        for (int el : nums) {
            rightSum += el;
        }
        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                ans = i;
                break;
            }
            leftSum += nums[i];
        }
        return ans;
    }
}