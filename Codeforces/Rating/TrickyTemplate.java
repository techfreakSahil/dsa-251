package Codeforces.Rating;

import java.util.Scanner;

public class TrickyTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int flag = 0;
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) != c.charAt(i) && b.charAt(i) != c.charAt(i)) {
                    flag = 1;
                }
            }
            System.out.println(flag == 1 ? "yes" : "no");
        }
    }
}
