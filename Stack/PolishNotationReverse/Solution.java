package Stack.PolishNotationReverse;

import java.util.Stack;

public class Solution {
    static public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<String>();
        int n = tokens.length;
        for (int i = 0; i < n; i++) {
            String ch = tokens[i];
            if (ch == "/") {
                int operand1 = Integer.parseInt(st.pop());
                int operand2 = Integer.parseInt(st.pop());
                int ans = operand2 / operand1;
                st.push(String.valueOf(ans));
            } else if (ch == "*") {
                int operand1 = Integer.parseInt(st.pop());
                int operand2 = Integer.parseInt(st.pop());
                int ans = operand2 * operand1;
                st.push(String.valueOf(ans));
            } else if (ch == "+") {
                int operand1 = Integer.parseInt(st.pop());
                int operand2 = Integer.parseInt(st.pop());
                int ans = operand2 + operand1;
                st.push(String.valueOf(ans));
            } else if (ch == "-") {
                int operand1 = Integer.parseInt(st.pop());
                int operand2 = Integer.parseInt(st.pop());
                int ans = operand2 - operand1;
                st.push(String.valueOf(ans));
            } else {
                st.push(ch);
            }
        }
        return Integer.parseInt(st.pop());
    }

    public static void main(String[] args) {
        String[] ans = new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        int res = evalRPN(ans);
        System.out.println(res);
    }
}
