public class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int total = 0;
        for (int i = 0; i < gain.length; i++) {
            total += gain[i];
            ans = Math.max(total, ans);
        }
        return ans;
    }

    public int maximumPopulation(int[][] logs) {
        int[] freq = new int[101];
        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            freq[birth - 1950]++;
            freq[death - 1950]--;
        }
        int max = freq[0];
        int yr = 1950;
        for (int i = 1; i < 101; i++) {
            freq[i] += freq[i - 1];
            if (freq[i] > max) {
                max = freq[i];
                yr = 1950 + i;
            }
        }
        return yr;
    }
}