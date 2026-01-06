class Solution {

    private int helper(int[] nums, int ind, int[] dp){
        if(ind==0) return nums[ind];
        if(ind<0) return 0;

        if(dp[ind]!= -1) return dp[ind];
        
        int pick = nums[ind] + helper(nums,ind-2,dp); // skip before element
        int nonPick = 0 + helper(nums,ind-1,dp); // take prev element

        return dp[ind] = Math.max(pick,nonPick);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++) dp[i] = -1;
        return helper(nums,nums.length-1,dp);
    }
}