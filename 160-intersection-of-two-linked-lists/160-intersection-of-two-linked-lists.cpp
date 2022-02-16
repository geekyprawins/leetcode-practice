/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if(!headA || !headB)return NULL;
    ListNode* first=headA,* second=headB;
        int count=0;
    while(first !=second)
    {
         if(count>2){return NULL;}
        if(first->next){first=first->next;}
        else{first=headB;count++;}
        if(second->next){second=second->next;}
        else{second=headA;count++;}
    }
    return first;
    }
};