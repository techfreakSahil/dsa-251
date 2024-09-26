import java.util.ArrayList;

public class Solution {
    public int findNearSquare(int index, ArrayList<Integer> a, ArrayList<Integer> b, int[] arr, int n) {
        if (index == n) {
            int sum_a = 0;
            int sum_b = 0;
            for (Integer x : a) {
                sum_a += x;
            }
            System.out.println("sum_a: " + sum_a);
            for (Integer x : b) {
                sum_b += x;
            }
            return Math.abs(sum_a * sum_a - sum_b * sum_b);
        }
        a.add(arr[index]);
        int res1 = findNearSquare(index + 1, a, b, arr, n);
        a.remove(a.size() - 1);

        b.add(arr[index]);
        int res2 = findNearSquare(index + 1, a, b, arr, n);
        b.remove(b.size() - 1);

        return Math.min(res1, res2);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 4, 5, 10, 3 };
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int n = arr.length;
        int res = sol.findNearSquare(0, a, b, arr, n);
        System.out.println(res);
    }
}
