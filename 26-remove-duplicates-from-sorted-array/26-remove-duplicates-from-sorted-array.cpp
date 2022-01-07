class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        int c=1;
        
        int n = nums.size();
        if(n < 2) return n;
        for(int i=1;i<nums.size();i++){
            if(nums[i]!=nums[i-1])
                nums[c++]=nums[i];
          
        }
        return c;
    }
};