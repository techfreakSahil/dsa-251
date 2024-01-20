package BinaryTreesBST.nAryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if (root == null)
            return ans;
        st.push(root);
        while (!st.isEmpty()) {
            Node child = st.pop();
            // System.out.println(child.val);
            ans.add(child.val);
            for (int i = child.children.size() - 1; i >= 0; i--) {
                st.push(child.children.get(i));
            }
        }
        return ans;
    }
}
