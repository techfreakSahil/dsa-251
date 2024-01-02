package BasicAlgorithms.SelectionSort;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 4, 2, 1, 4, 7, 8 };
        selectionSort(arr);
        display(arr);
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }

            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }

    }

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}