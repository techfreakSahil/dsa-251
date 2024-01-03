package MixedQuestion1.IntersectionOfTwoArrays;

import java.util.HashMap;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            mp.put(nums1[i], 0);
        }
        int idx = 0;
        for (int i = 0; i < nums2.length; i++) {
            Integer num = mp.get(nums2[i]);
            if (num != null && num != 1) {
                idx++;
                mp.put(nums2[i], ++num);
            }
        }
        int c = 0;
        int[] ans = new int[idx];
        for (Integer i : mp.keySet()) {
            Integer num = mp.get(i);
            if (c == idx)
                return ans;
            if (num == 1)
                ans[c++] = i;
        }
        return ans;
    }
}
