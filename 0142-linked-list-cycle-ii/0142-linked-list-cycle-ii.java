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
    private ListNode detectCycle2(ListNode head) {
        // Set up slow and fast for finding the collision
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            // If we found the collision than find the first node of the cycle
            if (slow == fast) {
                ListNode slow2 = head;
                while (slow != slow2) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow2;
            };
        }
        // There is no cycle
        return null;
    }
    private ListNode detectCycle1(ListNode head) {
        // Set up HashSet for tracking the Node frequency
        HashSet<ListNode> set = new HashSet<>();
        ListNode it = head;
        while (it != null) {
            // We found the first node of the cycle
            if (set.contains(it)) return it;
            else set.add(it);
            it = it.next;
        }
        // There is no cycle
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        // Brute force
        // return detectCycle1(head);

        // Optimal approach
        return detectCycle2(head);
    }
}