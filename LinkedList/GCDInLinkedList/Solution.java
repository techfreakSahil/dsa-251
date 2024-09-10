package LinkedList.GCDInLinkedList;

public class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            ListNode a = cur;
            ListNode b = cur.next;
            int gcd = GCD(a.val, b.val);
            ListNode newNode = new ListNode(gcd, b);
            cur.next = newNode;
            cur = b;
        }
        return head;
    }

    private int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}