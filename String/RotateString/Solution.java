package String.RotateString;

public class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        String joinS = s + s;
        return joinS.contains(goal) ? true : false;
    }
}
