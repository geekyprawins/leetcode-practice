class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
       sort(nums.begin(),nums.end());
        
        for(int i=1;i<nums.size();i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
};
// return nums.size() > set<int>(nums.begin(),nums.end()).size();