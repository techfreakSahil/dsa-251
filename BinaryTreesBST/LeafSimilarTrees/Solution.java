package BinaryTreesBST.LeafSimilarTrees;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> s1 = sequence(root1);
        List<Integer> s2 = sequence(root2);
        if (s1.size() != s2.size())
            return false;
        for (int i = 0; i < s1.size(); i++) {
            if (s1.get(i) != s2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> sequence(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    public void helper(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            ans.add(root.val);
            return;
        }
        helper(root.left, ans);
        helper(root.right, ans);
    }
}