package Arrays.SequentialDigits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String nums = "123456789";
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length(); i++) {
            for (int j = i + 1; j < nums.length(); j++) {
                int element = Integer.parseInt(nums.substring(i, j + 1));
                if (element > high)
                    break;
                if (element >= low)
                    ans.add(element);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}