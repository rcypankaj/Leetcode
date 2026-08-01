class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j+i-1< n; j++) {
                int k = i+j-1;
                int pickLeft = nums[j]-dp[j+1][k];
                int pickRight = nums[k]-dp[j][k-1];

                dp[j][k] = Math.max(pickLeft, pickRight);
            }
        }

        return dp[0][n-1] >= 0;
    }
}