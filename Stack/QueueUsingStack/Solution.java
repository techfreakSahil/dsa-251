package Stack.QueueUsingStack;

import java.util.Stack;

public class Solution {
    class MyQueue {
        Stack<Integer> st = new Stack<>();

        public MyQueue() {
        }

        public void push(int x) {
            Stack<Integer> temp = new Stack<>();
            while (!st.isEmpty()) {
                temp.push(st.pop());
            }
            st.push(x);
            while (!temp.isEmpty()) {
                st.push(temp.pop());
            }
        }

        public int pop() {
            return st.pop();
        }

        public int peek() {
            return st.peek();
        }

        public boolean empty() {
            return st.size() == 0;
        }
    }
}
