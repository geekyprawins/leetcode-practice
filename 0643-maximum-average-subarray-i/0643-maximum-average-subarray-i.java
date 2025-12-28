class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;
        for(int i = 0; i<k;i++){
            sum+=nums[i];
        }
        double maxSum = sum;

        for(int i=k; i<nums.length;i++){
            sum = sum + nums[i]; // add
            sum = sum - nums[i-k]; // remove
            maxSum = Math.max(maxSum,sum)
        }
        return maxSum/k;
        
    }
}