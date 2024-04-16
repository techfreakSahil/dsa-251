package Arrays.RepeatAndMissingNumber;

public class Solution {
    public int[] repeatedNumber(final int[] A) {
        int[] result = new int[2];
        for (int i = 0; i < A.length; i++) {
            int index = Math.abs(A[i]) - 1;
            if (A[index] < 0) {
                result[0] = Math.abs(A[i]);
            } else {
                A[index] = -A[index];
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }
}
