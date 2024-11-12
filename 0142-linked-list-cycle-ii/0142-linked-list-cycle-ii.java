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
    private ListNode detectCycel2(ListNode head) {

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                ListNode slow2 = head;
                while (slow != slow2) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow2;
            };
        }
        return null;
    }
    private ListNode detectCycle1(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode it = head;
        int count = 0;
        while (it != null) {
            if (set.contains(it)) {
                return it;
            } else {
                set.add(it);
            }
            it = it.next;
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        // return detectCycle1(head);
        return detectCycel2(head);
    }
}