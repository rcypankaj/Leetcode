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
    private ListNode reverseList1(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        ListNode temp = head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            temp.val = stack.pop();
            temp = temp.next;
        }
        return head;
    }
    private ListNode reverseList2(ListNode head) {
        ListNode prev = null, temp = head;
        while (temp != null) {
            ListNode rem = temp.next;
            temp.next = prev;
            prev = temp;

            temp = rem;
        }
        return prev;
    }
    public ListNode reverseList(ListNode head) {
        // Brute force
        // return reverseList1(head);
        // Optimal Approach 1
        return reverseList2(head);
    }
}