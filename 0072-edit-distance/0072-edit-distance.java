class Solution {

    private int helper(int i, int j, String w1, String w2,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        
        if(dp[i][j] != -1) return dp[i][j];

        if(w1.charAt(i)==w2.charAt(j)) return dp[i][j] = 0 + helper(i-1,j-1,w1,w2,dp); // matching char, do nothing, trim the string
        // not matching cases
        //insert char after i
        int ins = 1 + helper(i,j-1,w1,w2,dp);
        // delete char at i
        int del = 1 + helper(i-1,j,w1,w2,dp);
        // replace char at i
        int rep = 1 + helper(i-1,j-1,w1,w2,dp);

        return dp[i][j] = Math.min(ins,Math.min(del,rep));

    }
    public int minDistance(String word1, String word2) {
        int i = word1.length();
        int j = word2.length(); 
        int[][] dp = new int[i][j];
        for(int[] row : dp) Arrays.fill(row,-1);
        return helper(i-1,j-1,word1,word2,dp);
    }
}