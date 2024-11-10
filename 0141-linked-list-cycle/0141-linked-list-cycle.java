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
    private void printList(ListNode head) {
        ListNode it = head;
        while (it != null) {
            System.out.println(it.val);
            it = it.next;
        }
    }
    private boolean hasCycle2(ListNode head) {
        HashSet<ListNode> freq = new HashSet<>();   
        ListNode it = head;
        while (it != null) {
            if (freq.contains(it)) return true;
            else {
                freq.add(it);
            }
            it = it.next;
        }
        return false;
    }
    public boolean hasCycle(ListNode head) {
        return hasCycle2(head);
    }
}