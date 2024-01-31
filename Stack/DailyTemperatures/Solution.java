package Stack.DailyTemperatures;

import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < ans.length; i++) {
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
                ans[st.peek()] = i - st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}