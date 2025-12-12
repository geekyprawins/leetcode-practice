/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode dummy = head;
        while(dummy!=null && dummy.next!=null){
            dummy.val = Integer.MIN_VALUE;
            if(dummy.next.val==Integer.MIN_VALUE) return true;
            dummy = dummy.next;
        }
        return false;
    }
}