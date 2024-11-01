package String.FancyString;

public class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        res.append(s.charAt(0));
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == res.charAt(res.length() - 1)) {
                count++;
                if (count < 3) {
                    res.append(s.charAt(i));
                }
            } else {
                count = 1;
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}