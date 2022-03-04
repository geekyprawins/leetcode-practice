class Solution {
public:
    bool rotateString(string s, string goal) {
        
        if(s.length() != goal.length())
            return false;
        string p = goal+goal;
        if(p.find(s) != string::npos){
            return true;
        }
        return false;
    }
};