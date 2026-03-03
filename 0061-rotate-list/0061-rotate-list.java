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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
            
        int nodes = 1;
        ListNode tail = head;
        while(tail.next!=null){
            nodes++;
            tail = tail.next;
        }
        if(k%nodes== 0) return head;
        k= k%nodes;

        ListNode temp = head;
        int newTailInd = nodes - k;
        int i = 0;
        while(temp!=null){
            i++;
            if(i==newTailInd) break;
            temp=temp.next;
        }
        ListNode newHead = temp.next;
        tail.next = head;
        temp.next = null;

        return newHead;
    }
}