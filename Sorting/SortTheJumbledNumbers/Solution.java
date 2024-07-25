package Sorting.SortTheJumbledNumbers;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!mp.containsKey(nums[i])) {
                mp.put(nums[i], digitMapping(nums[i], mapping));
            }
        }
        Integer[] mappedNumber = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(mappedNumber, (a, b) -> Integer.compare(mp.get(a), mp.get(b)));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = mappedNumber[i];
        }
        return nums;
    }

    private int digitMapping(int num, int[] mapping) {
        if (num == 0)
            return mapping[0];
        int res = 0;
        int mult = 1;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            res += mapping[digit] * mult;
            mult *= 10;
        }
        return res;
    }
}
