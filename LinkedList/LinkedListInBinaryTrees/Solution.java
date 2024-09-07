package LinkedList.LinkedListInBinaryTrees;

public class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null)
            return true;
        if (root == null)
            return false;
        return isSubPath(head, root, false) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean isSubPath(ListNode head, TreeNode root, boolean isHead) {
        if (head == null)
            return true;
        if (root == null)
            return false;
        if (head.val == root.val) {
            return isSubPath(head.next, root.left, true) || isSubPath(head.next, root.right, true);
        }
        if (isHead)
            return false;
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
}