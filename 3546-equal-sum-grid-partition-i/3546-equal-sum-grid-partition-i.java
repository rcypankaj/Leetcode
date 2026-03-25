class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        long totalSum = 0;
        for (int[] row : grid) {
            for (int val: row) totalSum += val;
        }

        if ((totalSum&1) == 1) return false;

        long target = totalSum/2;
        long curr = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m; j++) {
                curr += grid[i][j];
            }
            if (target == curr) return true;
        }
        curr = 0;
        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < n; j++) {
                curr += grid[j][i];
            }
            if (target == curr) return true;
        }
        return false;
    }
}