/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;
        ListNode da = headA;
        ListNode db = headB;

        while(da!= db){
            da = da==null ? headB: da.next;
            db = db==null ? headA : db.next;
        }
        
        return da;
        //return db; as da=db
    }
}