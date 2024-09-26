public class Solution {
    public int findNearSquare(int index, int sum_a, int sum_b, int[] arr, int n) {
        if (index == n) {
            return Math.abs(sum_a * sum_a - sum_b * sum_b);
        }

        int res1 = findNearSquare(index + 1, sum_a + arr[index], sum_b, arr, n);
        int res2 = findNearSquare(index + 1, sum_a, sum_b + arr[index], arr, n);

        return Math.min(res1, res2);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 4, 5, 10, 3 };
        int n = arr.length;
        int res = sol.findNearSquare(0, 0, 0, arr, n);
        System.out.println(res);
    }
}
