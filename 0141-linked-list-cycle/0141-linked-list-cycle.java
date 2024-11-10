/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private boolean hasCycle2(ListNode head) {
        // Return false if we have null in the node
        if (head == null || head.next == null) return false;
        ListNode slow = head, fast = head.next.next;

        // Iterate over ListNode until we found same node or null
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    private boolean hasCycle1(ListNode head) {
        // Keep a hashset to track the previously occured node
        HashSet<ListNode> freq = new HashSet<>();   
        ListNode it = head;
        while (it != null) {
            // return if we found exixting node
            if (freq.contains(it)) return true;
            freq.add(it);
            it = it.next;
        }
        return false;
    }
    public boolean hasCycle(ListNode head) {
        // Brute force
        // return hasCycle1(head);

        return hasCycle2(head);
    }
}