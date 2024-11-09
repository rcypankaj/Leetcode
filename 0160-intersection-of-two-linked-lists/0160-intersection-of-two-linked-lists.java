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

    private ListNode intersectionNode2(ListNode headA, ListNode headB) {
        HashSet<ListNode> freq = new HashSet<>();
        ListNode it1 = headA, it2 = headB;
        while (it1 != null) {
            freq.add(it1);
            it1 = it1.next;
        }

        while (it2 != null) {
            if (freq.contains(it2)) return it2;
            it2 = it2.next;
        }
        return null;
    }
    private ListNode intersectionNode1(ListNode headA, ListNode headB) {
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
        // return intersectionNode1(headA, headB);

        return intersectionNode2(headA, headB);
    }
}