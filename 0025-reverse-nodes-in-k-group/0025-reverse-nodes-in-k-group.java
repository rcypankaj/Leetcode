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
    private void reverseLinkedList(ListNode head) {
        // Set up the prev node and current node to the head
        ListNode prev = null, curr = head;

        // Traverse the Linked List until reaching end
        while (curr != null) {
            // Store the next node as the prevNode
            ListNode nextNode = curr.next;

            // Set the current node's next pointer to the previous node
            curr.next = prev;

            // Update the previous node to the current node
            prev = curr;

            // Move current node to next node
            curr = nextNode;

        }
    }
    private ListNode findKthNode(ListNode head, int k) {
        // Set up the current node
        ListNode curr = head;

        k -= 1;

        // Traverse curr node to nextNode kth times
        while (curr != null && k-- > 0) curr = curr.next;

        return curr;
    }
    private ListNode reverseGroup(ListNode head, int k) {
        // Set up the current node and previous node
        ListNode curr = head, prev = null;

        // Traverse the Linked List until current node reaching end
        while (curr != null) {
            // Find kth node
            ListNode kth = findKthNode(curr, k);

            // If kth node is null that means no more reversing break the iteration
            if (kth == null) {
                if (prev != null) prev.next = curr;
                break;
            }

            // Store next node to kth node next
            ListNode nextNode = kth.next;

            // Point kth node next to the null for reverse
            kth.next = null;

            reverseLinkedList(curr);

            // current node is equal to head set up head to kth node
            if (curr == head) head = kth;
            else prev.next = kth;

            // update previous node by the current node
            prev = curr;

            // update current node to the nextNode
            curr = nextNode;

        }
        return head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        return reverseGroup(head, k);
    }
}