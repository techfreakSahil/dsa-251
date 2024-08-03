package Codeforces.TLE.HaloumiBoxes;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            boolean not_sorted = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    not_sorted = true;
                }
            }

            if (n > 1 && k == 1 && not_sorted) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}
