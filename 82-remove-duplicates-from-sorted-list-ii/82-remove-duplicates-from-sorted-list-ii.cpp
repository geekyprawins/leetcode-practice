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
    ListNode* deleteDuplicates(ListNode* head) {
        if (!head || !head->next)
            return head;
        ListNode* next_ptr = head->next;
        if (head->val == next_ptr->val)
        {
            while(head->next && head->val == head->next->val)
            {
                head->next = head->next->next;
            }
            return deleteDuplicates(head->next);
        }
        else
            head->next = deleteDuplicates(next_ptr);
        return head;
    }
};