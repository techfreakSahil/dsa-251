package Arrays.SecondLargestElement;

public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		int largestElement = Integer.MIN_VALUE, secondLargestElement = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestElement) {
				secondLargestElement = largestElement;
				largestElement = arr[i];
			} else if (arr[i] < largestElement && arr[i] > secondLargestElement) {
				secondLargestElement = arr[i];
			}

		}
		return secondLargestElement == Integer.MIN_VALUE ? -1 : secondLargestElement;
	}
}