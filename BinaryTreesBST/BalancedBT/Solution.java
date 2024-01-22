package BinaryTreesBST.BalancedBT;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return diffHeight(root) != -1;
    }

    public int diffHeight(TreeNode cur) {
        if (cur == null)
            return 0;
        int leftTree = diffHeight(cur.left);
        if (leftTree == -1)
            return -1;
        int rightTree = diffHeight(cur.right);
        if (rightTree == -1)
            return -1;
        if (Math.abs(leftTree - rightTree) > 1)
            return -1;
        return 1 + Math.max(leftTree, rightTree);
    }
}
