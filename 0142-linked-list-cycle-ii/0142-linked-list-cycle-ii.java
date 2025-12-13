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
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow = head, fast = head;
        boolean foundLoop = false;
        while(fast.next!=null && fast.next.next!=null){
    
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                foundLoop = true;
                break;
            };
        }
        if(foundLoop){
            ListNode entry = head;
            while(slow!=entry){
                slow = slow.next;
                entry = entry.next;
            }
            return entry;
        }
        else return null;

    }
}