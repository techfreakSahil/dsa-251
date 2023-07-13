package Maps.SubArraySumEqaulsK;

import java.util.HashMap;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int sum = 0, n = nums.length;
        int ans = 0;
        freq.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int removeSum = sum - k;
            ans += freq.getOrDefault(removeSum, 0);
            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }
        return ans;

    }
}