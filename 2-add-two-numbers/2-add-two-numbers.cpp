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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
        int carry=0;
    ListNode *head=NULL;
    ListNode *tail=head;
    while(l1 || l2)
    {
        int sum=0;
        if(l1) //if l1 is not NULL, add its value
            sum+=l1->val;
        if(l2)//if l2 is not NULL, add its value
            sum+=l2->val;
        sum+=carry; //it is just like the carry variable we maintain while adding two numbers
        if(sum>=10)
        {
            sum=sum%10; //lets say the sum is 18, we will write 8 instead and take carry of 1
            carry=1;
        }
        else
            carry=0; //if the sum is less than 8, put carry to 0
        if(!head)
        {
            head=new ListNode(sum); //creating our answer linked list
            tail=head;
        }
        else
        {
            tail->next=new ListNode(sum);
            tail=tail->next;
        }
        if(l1) //if l1 exists, point to next node
            l1=l1->next;
        if(l2)//if l2 exists, point to next node
            l2=l2->next;
    }
    if(carry) //take an example of the case 9999999 and 9999. When you add both the numbers, you are left with carry=1 at the end, so create another node
        tail->next=new ListNode(1);
    return head;
        
    }
};