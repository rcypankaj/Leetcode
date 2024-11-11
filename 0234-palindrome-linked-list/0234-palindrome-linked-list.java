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
    private boolean isPalindrome1(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode it = head;
        while (it != null) {
            list.add(it.val);
            it = it.next;
        }

        int l = 0, r = list.size()-1;

        while (l < r) {
            if (list.get(l) != list.get(r)) return false;
            l++;
            r--;
        }
        return true;

    }
    public boolean isPalindrome(ListNode head) {
        // Brute force 
        return isPalindrome1(head);
    }
}