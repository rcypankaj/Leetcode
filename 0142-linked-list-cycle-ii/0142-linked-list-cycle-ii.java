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
        return detectCycle1(head);
    }
}