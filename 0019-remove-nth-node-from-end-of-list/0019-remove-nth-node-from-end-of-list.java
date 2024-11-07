/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode removeNthFromEnd1(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int nth = size-n;
        temp = head;
        if (nth == 0) return head.next;
        while (nth >= 0) {
            if (nth == 1) temp.next = temp.next.next;
            else temp = temp.next;
            nth--;
        }
        return head;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return removeNthFromEnd1(head, n);
        // return head;
    }
}