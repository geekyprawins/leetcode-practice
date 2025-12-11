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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //O(2n)
        // int count = 0;
        // ListNode temp = head;
        // ListNode ans = head;

        // while(temp!=null){
        //     count++;
        //     temp = temp.next;
        // }
        // int i = count-n;

        // if(count==1 && n==1) return null;
        // if(i==0) return head.next;

        // for(int j=0; j<i-1;j++){
        //     head = head.next;
        // }
        // if(head!=null && head.next!=null) head.next = head.next.next;

        // return ans;

        // O(n)
        ListNode start = new ListNode();
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;

        for(int i=1;i<=n;i++){
            fast = fast.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return start.next;
    }
}