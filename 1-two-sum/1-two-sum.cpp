class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> m;
        for(int i=0; i<nums.size();i++){
            if(m.find(target - nums[i]) == m.end()){
                // not found
                m.insert(pair<int,int>(nums[i],i));
                
            }
            else{
                 vector<int> x = {i,(m.find(target - nums[i]))->second};
                return x;
            }
            
        }
        return vector<int>();
    }
};