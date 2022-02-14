class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
         map<string, vector<int>> mp;
        vector<string> strs_org = strs;
        vector<vector<string>> ans;
        for(int i=0;i<strs.size();i++){
            sort(strs[i].begin(), strs[i].end());            
            mp[strs[i]].push_back(i);
        }
        for(auto m: mp){
            vector<string> temp;
            for(auto idx: m.second){
                temp.push_back(strs_org[idx]);
            }
            ans.push_back(temp);
        }
        return ans;
    }
};