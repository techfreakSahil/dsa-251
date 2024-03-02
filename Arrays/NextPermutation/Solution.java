package Arrays.NextPermutation;

public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int idx = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            reverse(nums, 0, nums.length - 1);
        } else {
            for (int i = nums.length - 1; i >= idx; i--) {
                if (nums[i] > nums[idx]) {
                    swap(nums, i, idx);
                    break;
                }
            }
            reverse(nums, idx + 1, nums.length - 1);
        }
    }

    public void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void reverse(int arr[], int a, int b) {
        while (a < b) {
            swap(arr, a++, b--);
        }
    }
}
