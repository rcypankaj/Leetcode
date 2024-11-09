/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private void printListNode(ListNode head) {
        ListNode it1 = head;
        while (it1 != null) {
            System.out.println(it1.val);
            it1 = it1.next;
        }
    }
    private ListNode intersectionVal(ListNode headA, ListNode headB) {
        ListNode it2 = headB;
        while (it2 != null) {
            ListNode it1 = headA;
            while (it1 != null) {
                if (it1 == it2) return it2;
                it1 = it1.next;
            }
            it2 = it2.next;
        }
        return null;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        printListNode(headA);
        return intersectionVal(headA, headB);
    }
}