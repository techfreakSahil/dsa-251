package Arrays.RotateArray;

import java.util.*;

class Solution {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int j;
            int first = arr[0];

            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[j] = first;
        }

        for (int i : arr) {

            System.out.print(i + " ");

        }
        sc.close();
    }
}