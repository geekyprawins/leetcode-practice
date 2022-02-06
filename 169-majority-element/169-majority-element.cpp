class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int,int> m;
        for(auto n:nums)
            m[n]++;
        
        for(auto s:m)
            if((s.second ) > (floor(nums.size() / 2)))
                return s.first;
        return 0;
        
    }
};