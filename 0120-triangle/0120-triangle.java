class Solution {
    public int solve(int level, int index, List<List<Integer>> triangle, int[][] dp){
        if(level == triangle.size()) return 0;

        if(dp[level][index] != 10000000) return dp[level][index];

        int leftPath = solve(level+1, index, triangle, dp);
        int rightPath = solve(level+1, index+1, triangle, dp);
        dp[level][index] = triangle.get(level).get(index) + Math.min(leftPath, rightPath);
        return dp[level][index];
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];

        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],10000000); // max value as per constraints
        }

        return solve(0,0,triangle,dp);
    }
}