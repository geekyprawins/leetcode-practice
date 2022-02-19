/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    void reorderList(ListNode* head) {
        stack<ListNode*>S;
ListNode* curr = head;
while(curr)
{
S.push(curr);
curr = curr->next;
}
curr = head;
int n = S.size();
if(n<=2)
return;

    ListNode* next;
    for(int i=0;i<n/2;i++)
    {
        next = curr->next;
        curr->next = S.top();
        S.pop();
        curr = curr->next;
        curr->next = next;
        curr = curr->next;
    }
    curr->next = nullptr;
}
    
};