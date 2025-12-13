class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        
        int count = 0;
        int maxC = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                maxC = Math.max(maxC,count);
            } 
            else count=0;
        }
        return maxC;
    }
}