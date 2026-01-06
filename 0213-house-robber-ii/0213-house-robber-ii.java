class Solution {

    private int helper(int[] nums, int ind, int excl, int[] dp){
        if(ind==excl) return 0;
        if(ind==0) return nums[ind];
        if(ind<0) return 0;

        if(dp[ind]!= -1) return dp[ind];
        
        int pick = nums[ind] + helper(nums,ind-2,excl,dp); // skip before element
        int nonPick = 0 + helper(nums,ind-1,excl,dp); // take prev element

        return dp[ind] = Math.max(pick,nonPick);
    }
    public int rob(int[] nums) {
        // first and last can't occur together as its circular
        // so 1) leave out the last, take first 2) leave out the first, take last
        // ans = max(1,2)
        int n = nums.length;
        if (n == 1) return nums[0];

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        
        int case1 = helper(nums,n-2,n-1,dp1); // exclude last house
        int case2 = helper(nums,n-1,0,dp2); // exclude first house
        return Math.max(case1,case2);
    }
}