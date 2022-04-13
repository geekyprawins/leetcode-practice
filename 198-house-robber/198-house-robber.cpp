class Solution {
public:
    int rob(vector<int>& nums) {
        int n = nums.size();
        if(n == 1) return nums[0];
        
        int prev_ans2=nums[0], prev_ans=max(nums[0],nums[1]),curr_ans=prev_ans;
        
        for(int i = 2; i < n; i++){
            curr_ans = max(prev_ans, prev_ans2 + nums[i]);
            prev_ans2 = prev_ans;
            prev_ans = curr_ans;
        }
        return curr_ans;
    }
};