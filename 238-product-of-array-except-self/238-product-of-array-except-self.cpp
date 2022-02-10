class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> ans(nums.size(),1);
        int l=nums[0];
        
	// product from left side of element
        for(int i=1; i<nums.size(); i++){
            ans[i]=l;
            l=l*nums[i];
        }
	// product from right side of element

        int r=nums[nums.size()-1];
        for(int i=nums.size()-2; i>=0; i--){
            ans[i]=ans[i]*r;
            r=r*nums[i];
        }
        return ans;
        
    }
};