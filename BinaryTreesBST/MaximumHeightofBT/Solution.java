package BinaryTreesBST.MaximumHeightofBT;

public class Solution {
    public int maxDepth(TreeNode root) {
        // recurrence formula is 1 + max(leftTree, rightTree)
        if (root == null)
            return 0;

        int leftTree = maxDepth(root.left);
        int rightTree = maxDepth(root.right);

        return 1 + Math.max(leftTree, rightTree);
    }
}