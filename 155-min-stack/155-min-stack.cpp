class MinStack {

public:     
stack<int>montStack ;
stack<int>stk ;
MinStack() {
}
void push(int val) {
    stk.push(val) ;
    if (!montStack.size()||val<=montStack.top())
        montStack.push(val) ;
}

void pop() {
    if (stk.top()==montStack.top())
        montStack.pop() ;
    stk.pop() ;
}

int top() {
    return stk.top() ;
}

int getMin() {
    return montStack.top() ;
}
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */