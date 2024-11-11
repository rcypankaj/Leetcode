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
    private void printList(ListNode head) {
        ListNode it = head;
        while (it != null) {
            System.out.print(it.val+" ");
            it = it.next;
        }
    }
    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null, it = head;

        while (it != null) {
            ListNode nextNode = it.next;
            it.next = prev;
            prev = it;
            it = nextNode;
        }
        return prev;
    }
    
    private boolean isPalindrome3(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        // Find middle node
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Get the reversed linked list
        ListNode newHead = reverseLinkedList(slow);
        ListNode slow1 = head, slow2 = newHead;

        while (slow2 != null) {
            // return false slow1 val != slow2 val 
            if (slow1.val != slow2.val) return false;
            slow1 = slow1.next;
            slow2 = slow2.next;
        }
        return true;
    }
    private boolean isPalindrome2(ListNode head) {

        if (head == null || head.next == null) return true;
        
        ListNode slow = head, fast = head;
        // Find middle node
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Get the reversed linked list
        ListNode newHead = reverseLinkedList(slow);
        ListNode slow1 = head, slow2 = newHead;

        while (slow2 != null) {
            // return false slow1 val != slow2 val 
            if (slow1.val != slow2.val) {
                // Get back the list to its original state
                reverseLinkedList(newHead); 
                return false;
            }
            slow1 = slow1.next;
            slow2 = slow2.next;
        }
        // Get back the list to its original state
        reverseLinkedList(newHead); 
        return true;
    }
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
        // return isPalindrome1(head);

        // Optimal approach
        // return isPalindrome2(head);

        // Optimal approach3
        return isPalindrome3(head);
    }
}