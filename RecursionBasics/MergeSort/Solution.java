package RecursionBasics.MergeSort;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;

        mergeSort(arr, 0, n - 1);

        display(arr);
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    static void display(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
