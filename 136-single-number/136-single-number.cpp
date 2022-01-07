class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int answer=0;
       for(auto i: nums){
           answer ^= i;
       }
        return answer;
    }
};