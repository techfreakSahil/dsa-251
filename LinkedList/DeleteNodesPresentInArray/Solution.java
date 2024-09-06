package LinkedList.DeleteNodesPresentInArray;

public class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        boolean[] freq = new boolean[max + 1];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]] = true;
        }

        ListNode temp = new ListNode();
        ListNode cur = temp;

        while (head != null) {
            if (head.val >= freq.length || freq[head.val] == false) {
                cur.next = head;
                cur = cur.next;
            }
            head = head.next;
        }
        cur.next = null;
        return temp.next;
    }
}