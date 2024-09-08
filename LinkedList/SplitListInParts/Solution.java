package LinkedList.SplitListInParts;

public class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        int eqNodes = len / k;
        int exNodes = len % k;
        cur = head;
        int i = 0;
        ListNode prev = null;
        while (cur != null && i < k) {
            res[i] = cur;
            for (int j = 0; j < eqNodes + (exNodes > 0 ? 1 : 0); j++) {
                prev = cur;
                cur = cur.next;
            }
            prev.next = null;
            i++;
            exNodes--;
        }

        return res;
    }
}