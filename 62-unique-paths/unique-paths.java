class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        return countPaths(m,n,dp);
    }
    public static int countPaths(int r,int c,int[][] dp){
        if(r==1 || c==1){
            return 1;
        }
        if(dp[r][c]!=0){
            return dp[r][c];
        }
        dp[r][c] = countPaths(r-1,c,dp) + countPaths(r,c-1,dp);

        return dp[r][c];
    }
}