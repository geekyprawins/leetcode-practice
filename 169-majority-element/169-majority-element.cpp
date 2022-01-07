class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n=nums.size();
        int count=1, major=nums[0];
       
        
        for(int i=1; i<n; i++){
            if(count==0){
                count++;
                major = nums[i];
            }
            else if(major==nums[i]){
                count++;
            }
           else count--;
            
        }
   return major;
    }
};

