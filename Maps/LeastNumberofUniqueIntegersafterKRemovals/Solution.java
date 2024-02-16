package Maps.LeastNumberofUniqueIntegersafterKRemovals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());

        list.sort((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> values : list) {
            if (values.getValue() <= k) {
                k -= values.getValue();
                mp.remove(values.getKey());
            } else {
                break;
            }
        }
        return mp.size();
    }
}