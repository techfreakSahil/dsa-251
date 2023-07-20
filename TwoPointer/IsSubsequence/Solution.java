package TwoPointer.IsSubsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int a = s.length();
        int b = t.length();
        int c = 0;

        if (a == 0)
            return true;
        if (a > b)
            return false;

        for (int i = 0; i < b; i++) {
            if (s.charAt(c) == t.charAt(i)) {
                if (c == a - 1) {
                    return true;
                }
                c++;
            }
        }

        return false;
    }
}
