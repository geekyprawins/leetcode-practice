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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int sum = 0, carry=0;

       ListNode ans = new ListNode();
       ListNode temp = ans;
       

       while(l1!=null || l2!=null || carry!=0){
        if(l1!=null) sum+= l1.val;
        if(l2!=null) sum+= l2.val;
        sum+= carry;
        ListNode newNode = new ListNode();
       
        newNode.val = sum%10;
        carry = sum/10;

        sum=0;
        temp.next = newNode;

        if(l1!=null) l1 = l1.next;
        if(l2!= null) l2 = l2.next;
        temp = temp.next;

       }
        
        return ans.next;
    }
}