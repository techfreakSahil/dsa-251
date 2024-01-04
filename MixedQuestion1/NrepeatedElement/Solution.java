package MixedQuestion1.NrepeatedElement;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int hashSetSolution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public int hashMapSolution(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (mp.get(nums[i]) == nums.length / 2) {
                res = nums[i];
                break;
            }
        }
        return res;
    }
}
