package MixedQuestion1.CountingSort;

import java.util.Arrays;

public class Solution {

    public static int[] sort(int n, int arr[]) {
        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(0);
        int range = max - min + 1;
        int[] count = new int[range];
        for (int nums : arr) {
            count[nums - min]++;
        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        return ans;
    }

}
