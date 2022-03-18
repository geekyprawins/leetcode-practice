class Solution {
public:
    char findTheDifference(string s, string t) {
        unordered_map<char,int> sm;
        for(auto c :s)
            sm[c]++;
        for(auto c : t){
            if(sm[c] >= 1){
                sm[c]--;
            }
            else return c;
        }
       return NULL;
    }
};