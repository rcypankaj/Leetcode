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
    private ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        // Make a answer List
        ListNode res = new ListNode();
        // Create three iterators
        ListNode it1 = l1, it2 = l2, it3 = res;
        int carry = 0;


        // Traverse untill any element remains
        while (it1 != null || it2 != null || carry != 0) {
            int val1 = it1 != null ? it1.val : 0;
            int val2 = it2 != null ? it2.val : 0;
            int sum = val1+val2+carry;

            it3.next = new ListNode(sum%10);
            it3 = it3.next;
            carry = sum/10;
            if (it1 != null) it1 = it1.next;
            if (it2 != null) it2 = it2.next;
        }
        return res.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     return addTwoNumbers1(l1, l2);   
    }
}