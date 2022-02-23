class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
        
        vector<int> Trusted(n + 1, 0);
        for(auto person : trust){
            Trusted[person[0]]--;
            Trusted[person[1]]++;
        }
        for(int i = 1;i <= n;i++){
            if(Trusted[i] == n - 1)
                return i;
        }
        return -1;
    }
};