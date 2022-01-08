class Solution {
public:
    int firstUniqChar(string s) {
        
        unordered_map<char,int> m;
        for(auto c : s){
            if(m.find(c) == m.end()){
                m.insert(make_pair(c,1));
            }
            else m[c]++;
        }
        
        for(int i=0; s[i] ; i++){
            if(m[s[i]] == 1){
                return i; 
            }
        }
        return -1;
    }
};