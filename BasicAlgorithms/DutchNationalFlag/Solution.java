package BasicAlgorithms.DutchNationalFlag;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 1, 2, 1, 0, 1 };
        sortColors(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int temp;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0: // Red
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1: // White
                    mid++;
                    break;
                case 2: // Blue
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
            }
        }
    }
}
