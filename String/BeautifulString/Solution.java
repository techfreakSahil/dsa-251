package String.BeautifulString;

public class Solution {
    public static int makeBeautiful(String str) {
        int c1 = 0, c2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                if (str.charAt(i) != '0')
                    c1++;
            }
            if (i % 2 == 1) {
                if (str.charAt(i) != '1')
                    c1++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                if (str.charAt(i) != '1')
                    c2++;
            }
            if (i % 2 == 1) {
                if (str.charAt(i) != '0')
                    c2++;
            }
        }
        return c1 > c2 ? c2 : c1;
    }
}
