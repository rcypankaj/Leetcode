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
        ListNode res = new ListNode();
        ListNode it1 = l1, it2 = l2, it3 = res;
        int carry = 0;


        while (it1 != null || it2 != null || carry != 0) {
            int sum = 0;
            if (it1 != null && it2 != null) {
                sum += it1.val + it2.val+ carry;
            } else {
                sum = it1 == null && it2 == null ? carry : it1 == null ? it2.val + carry : it1.val+carry;

            }
            it3.next = new ListNode(sum%10);
            it3 = it3.next;
            carry = sum/10;
            it1 = it1 == null ? it1 : it1.next;
            it2 = it2 == null ? it2 : it2.next;
        }
        return res.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     return addTwoNumbers1(l1, l2);   
    }
}