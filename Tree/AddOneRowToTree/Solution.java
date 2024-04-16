package Tree.AddOneRowToTree;

public class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        helper(root, val, depth, 1);
        return root;
    }

    private void helper(TreeNode root, int val, int depth, int cur_depth) {
        if (root == null)
            return;
        if (cur_depth == depth - 1) {
            TreeNode l = root.left;
            TreeNode r = root.right;
            TreeNode newNode1 = new TreeNode(val);
            newNode1.left = l;
            root.left = newNode1;
            TreeNode newNode2 = new TreeNode(val);
            newNode2.right = r;
            root.right = newNode2;
            return;
        } else if (depth <= cur_depth)
            return;
        helper(root.left, val, depth, cur_depth + 1);
        helper(root.right, val, depth, cur_depth + 1);
    }
}
