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
    private ListNode rotateRight1(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) return head;

    // Step 1: Calculate the size of the list
    int size = 1; // Start from 1 since we are already at the head
    ListNode it = head;
    while (it.next != null) {
        size++;
        it = it.next;
    }

    // Step 2: Calculate the effective rotations needed
    k = k % size;
    if (k == 0) return head; // No rotation needed if k is a multiple of size

    // Step 3: Connect the last node to the head to form a circular list
    it.next = head;

    // Step 4: Find the new end of the list (size - k - 1 steps from the head)
    int stepsToNewEnd = size - k;
    ListNode newEnd = head;
    for (int i = 1; i < stepsToNewEnd; i++) {
        newEnd = newEnd.next;
    }

    // Step 5: The new head is next to the new end, break the circle
    head = newEnd.next;
    newEnd.next = null;

    return head;
}
    public ListNode rotateRight(ListNode head, int k) {
        return rotateRight1(head, k);
    }
}