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

    private ListNode intersectionNode4(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode pointer1 = headA;
        ListNode pointer2 = headB;

        // Traverse both lists until the pointers either meet or reach the end.
        while (pointer1 != pointer2) {
            // Move each pointer to the start of the other list upon reaching the end.
            // This will align them at the same number of steps from the intersection (if one exists).
            pointer1 = (pointer1 == null) ? headB : pointer1.next;
            pointer2 = (pointer2 == null) ? headA : pointer2.next;
        }

        // Return the intersection node or null if no intersection exists.
        return pointer1;
    }

    private int getDifference(ListNode headA, ListNode headB) {
        int len1 = 0, len2 = 0;
        ListNode currA = headA, currB = headB;

        // Calculate the length of each list
        while (currA != null) {
            len1++;
            currA = currA.next;
        }
        while (currB != null) {
            len2++;
            currB = currB.next;
        }

        return len1 - len2;
    }
    private ListNode intersectionNode3(ListNode headA, ListNode headB) {
        int diff = getDifference(headA, headB);

        // Move the pointer in the longer list by the difference in lengths
        if (diff > 0) {
            while (diff-- > 0) {
                headA = headA.next;
            }
        } else {
            while (diff++ < 0) {
                headB = headB.next;
            }
        }

        // Traverse both lists together until intersection is found
        while (headA != null && headB != null) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }

        return null; // No intersection
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

        // return intersectionNode2(headA, headB);

        // return intersectionNode3(headA, headB);

        return intersectionNode4(headA, headB);
    }
}