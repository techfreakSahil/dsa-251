package Arrays.MakingArrayEqual;

import java.util.HashMap;

public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            mp.put(target[i], mp.getOrDefault(target[i], 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                int cur = mp.get(arr[i]);
                if (cur > 1) {
                    mp.put(arr[i], cur - 1);
                } else {
                    mp.remove(arr[i]);
                    System.out.println(arr[i]);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
