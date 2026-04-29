class Solution {
    public long maximumScore(int[][] grid) {
        int n = grid.length;
        long[][] prefix = new long[n][n + 1];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                prefix[j][i + 1] = prefix[j][i] + grid[i][j];
            }
        }

        final long NEG = Long.MIN_VALUE / 4;
        long[][] dp = new long[n + 1][n + 1];
        for (long[] row : dp) java.util.Arrays.fill(row, NEG);
        for (int cur = 0; cur <= n; cur++) {
            dp[0][cur] = 0;
        }

        for (int j = 0; j < n - 1; j++) {
            long[][] newDp = new long[n + 1][n + 1];
            for (long[] row : newDp) java.util.Arrays.fill(row, NEG);

            for (int prev = 0; prev <= n; prev++) {
                for (int cur = 0; cur <= n; cur++) {
                    long base = dp[prev][cur];
                    if (base == NEG) continue;
                    for (int next = 0; next <= n; next++) {
                        int M = Math.max(prev, next);
                        long contrib = (M > cur) ? prefix[j][M] - prefix[j][cur] : 0L;
                        long cand = base + contrib;
                        if (cand > newDp[cur][next]) newDp[cur][next] = cand;
                    }
                }
            }
            dp = newDp;
        }

        long ans = 0;
        for (int prev = 0; prev <= n; prev++) {
            for (int cur = 0; cur <= n; cur++) {
                if (dp[prev][cur] == NEG) continue;
                long contrib = (prev > cur) ? prefix[n - 1][prev] - prefix[n - 1][cur] : 0L;
                long total = dp[prev][cur] + contrib;
                if (total > ans) ans = total;
            }
        }
        return ans;
    }
}