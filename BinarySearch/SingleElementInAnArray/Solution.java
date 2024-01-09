package BinarySearch.SingleElementInAnArray;

import java.util.ArrayList;

public class Solution {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        if (arr.size() == 1)
            return arr.get(0);
        if (!arr.get(0).equals(arr.get(1)))
            return arr.get(0);
        if (!arr.get(arr.size() - 1).equals(arr.get(arr.size() - 2)))
            return arr.get(arr.size() - 1);
        return helper(arr, 0, arr.size() - 2);
    }

    public static int helper(ArrayList<Integer> arr, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (!arr.get(mid).equals(arr.get(mid + 1)) && !arr.get(mid).equals(arr.get(mid - 1))) {
                return arr.get(mid);
            }
            if (((mid % 2 == 1) && arr.get(mid).equals(arr.get(mid - 1)))
                    || ((mid % 2 == 0) && arr.get(mid).equals(arr.get(mid + 1)))) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
