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
// brute: iterate linkedlist, store values in List, check if list is palindrome.
// TC - O(n), SC - O(n)

// optimal:
// find middle of linkedlist using slow and fast, reverse the the right half.
// init dummy to head then compare slow and head.
// if dummy.val = slow.val, until slow gets null, then its palindrome else its not.
// TC : O(n)
//SC : O(1)


class Solution {


    private ListNode reverseLL(ListNode head) {
        ListNode newHead = null;

        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;

        ListNode slow = head, fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }

        slow.next = reverseLL(slow.next);

        slow = slow.next;

        while(slow!=null){
            if(slow.val!=head.val) return false;
            head = head.next;
            slow=slow.next;
        }

        return true;
    }
}