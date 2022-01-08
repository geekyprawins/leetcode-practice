class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        for(auto c: s){
            if(c== '(' || c == '{' || c =='['){
                st.push(c);
            }
            else{
                if(st.empty()){
                    if(c==')' || c=='}' || c==']') return false;
                }
                if(st.top()=='(' && c==')' && !st.empty()) 
                    st.pop();
                
                else if(st.top()=='{' && c=='}' && !st.empty()) 
                    st.pop();
                
                else if(st.top()=='[' && c==']' && !st.empty()) 
                    st.pop();
                else st.push(c);
                
            }
        }
        return st.empty();
    }
};