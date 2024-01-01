package TwoPointer.MoveNegativeNumberToStart;

public class Solution {
    public static int[] separateNegativeAndPositive(int a[]) {
        int start = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                start++;
                int temp = a[i];
                a[i] = a[start];
                a[start] = temp;
            }
        }
        return a;
    }
}