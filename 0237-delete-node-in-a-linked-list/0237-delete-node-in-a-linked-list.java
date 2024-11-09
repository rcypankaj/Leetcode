/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private void deleteNode1(ListNode node) {
        int count = 0;
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public void deleteNode(ListNode node) {
        deleteNode1(node);
    }
}