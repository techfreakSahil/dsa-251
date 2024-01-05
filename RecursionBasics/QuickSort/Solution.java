package RecursionBasics.QuickSort;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 5, 9, 8, 4, 5, 10 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        display(arr);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = pivotIndex(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int pivotIndex(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;

    }

    static void display(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
