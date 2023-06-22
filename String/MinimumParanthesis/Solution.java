package String.MinimumParanthesis;

import java.util.Stack;

public class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(')');
            } else {
                if (!st.empty() && st.peek() == s.charAt(i)) {
                    st.pop();
                } else {
                    count++;
                }
            }
        }
        count += st.size();

        return count;
    }
}
