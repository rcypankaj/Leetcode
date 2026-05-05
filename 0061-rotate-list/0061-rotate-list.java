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
    private ListNode rotateListNode(ListNode head) {
        ListNode curr = head, prev = null;

        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = null;
        curr.next = head;
        return curr;
    }
    private int listNodeSize(ListNode head) {
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }
        return i;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int kTime = k%listNodeSize(head);
        for (int i = 0; i < kTime; i++) {
            head = rotateListNode(head);
        }
        return head;
    }
}