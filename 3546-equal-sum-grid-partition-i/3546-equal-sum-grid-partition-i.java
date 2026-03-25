class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        long totalSum = 0;
        int[] rowSum = new int[n];
        int[] colSum = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                totalSum += grid[i][j];
                rowSum[i] += grid[i][j];
                colSum[j] += grid[i][j];
            }
        }

        if ((totalSum&1) == 1) return false;

        long target = totalSum/2;
        long curr = 0;
        for (int i = 0; i < n-1; i++) {
            curr += rowSum[i];
            if (target == curr) return true;
        }
        curr = 0;
        for (int i = 0; i < m-1; i++) {
            curr += colSum[i];
            if (target == curr) return true;
        }
        return false;
    }
}