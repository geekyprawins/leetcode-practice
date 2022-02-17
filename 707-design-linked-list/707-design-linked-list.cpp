
class Node {
public:
    Node *next;
    
    int val;
    
    Node(int x){
        next = NULL;
        val = x;
    }
};

class MyLinkedList {
public:
    Node *head;
    Node *tail;
    int sz = 0;
    
    
    MyLinkedList() {
        head = tail = NULL;
    }
    
    int get(int index) {
        if(index >= sz) return -1;
        
        Node *cur = head;
        while(index){
            cur = cur->next;
            index--;
        }
        
        return cur->val;
    }
    
    void addAtHead(int val) {
        if(!head){
            head = tail = new Node(val);
        }
        else{
            Node *newNode = new Node(val);
            newNode->next = head;
            
            head = newNode;
        }
        sz++;
    }
    
    void addAtTail(int val) {
        if(!tail){
            head = tail = new Node(val);
        }
        else{
            Node *newNode = new Node(val);
            tail->next = newNode;
            
            tail = newNode;
        }
        sz++;
    }
    
    void addAtIndex(int index, int val) {
        if(index > sz) return;
        
        if(index == 0){
            addAtHead(val);
        }
        else if(index == sz){
            addAtTail(val);
        }
        else if(index < sz){
            Node *next = head;
            Node *prev = NULL;
            int pos = 0;
            
            while(pos < index){
                prev = next;
                next = next->next;
                pos++;
            }
            
            Node *newNode = new Node(val);
            newNode->next = next;
            prev->next = newNode;
            
            sz++;
        }
    }
    
    void deleteAtIndex(int index) {
        if(index < sz){
            Node *cur = head;
            Node *prev = NULL;
            Node *next = NULL;
            
            int pos = 0;
            
            while(pos < index){
                prev = cur;
                cur = cur->next;
                pos++;
            }
            
            next = cur->next;
            if(cur == head){
                head = head->next;
                delete cur;
            }
            else if(cur == tail){
                tail = prev;
                delete cur;
            }
            else{
                prev->next = next;
                delete cur;
            }
            
            sz--;
        }
    }
};