package BinaryTreesBST.DiamaterOfBT;

public class Solution {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root, max);
        return max;
    }

    public int helper(TreeNode cur, int max) {
        if (cur == null)
            return 0;
        int lTree = helper(cur.left, max);
        int rTree = helper(cur.right, max);
        this.max = Math.max(this.max, lTree + rTree);
        return 1 + Math.max(lTree, rTree);
    }
}
