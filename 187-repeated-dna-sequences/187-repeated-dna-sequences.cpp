class Solution {
public:
    vector<string> findRepeatedDnaSequences(string s) {
        int n = s.length();
        if(n<=10) return {};
        unordered_map<string,bool> s1;
        vector<string> v;
        
        string wi = s.substr(0,10);
        int j = 0;
        s1[wi] = false;
        for(int i = 10 ; i < n ; i++){
            wi = wi.substr(1,9)+s[i];
            if(s1.count(wi) and s1[wi]==false){
                v.push_back(wi);
                s1[wi] = true;
            }
            if(s1.count(wi)==0){
                s1[wi]= false;
            }
        }
        return v;
        
    }
};