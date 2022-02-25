class Solution {
public:
    string frequencySort(string s) {
        map<char,int> m;
        for(auto c : s){
            m[c]++;
        }
        string ans;
        
        priority_queue<pair<int,char>> pq;
        for(auto it: m){
            pq.push({it.second,it.first});
        }
        while(!pq.empty()){
            pair<int,char> curr = pq.top();
            pq.pop();
            int freq = curr.first;
            for(int i =0; i<freq;i++){
                ans.push_back(curr.second);
            }
        }
        return ans;
        
    }
};