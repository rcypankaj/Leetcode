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
    private ListNode removeNthFromEnd2(ListNode head, int n) {
        // Keep two variable slow and fast where fast will point to nth node
        ListNode slow = head, fast = head;
        int k = n;
        while (k-- > 0) {
            fast = fast.next;
        }

        if (fast == null) return head.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    private ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode temp = head;
        // Coumpute the length
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Find the removable node from the start
        int nth = size-n;

        temp = head;

        // if size is equal to nth node
        if (nth == 0) return head.next;

        while (nth >= 0) {
            if (nth == 1) temp.next = temp.next.next;
            else temp = temp.next;
            nth--;
        }
        return head;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Brute Force
        // return removeNthFromEnd1(head, n);

        // Optimal Approach
        return removeNthFromEnd2(head, n);

    }
} 