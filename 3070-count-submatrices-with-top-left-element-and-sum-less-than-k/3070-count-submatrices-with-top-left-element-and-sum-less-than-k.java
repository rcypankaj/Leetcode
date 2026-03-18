class Solution {
    public boolean isValid(int[][] grid, int r, int c, int k) {
        int sum = 0;
        for (int i = 0; i <= r; i++) {
            sum += grid[i][c];
        }
        return sum <= k;
    }
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int prev = 0;
            for (int j = 0; j < m; j++) {
                grid[i][j] += prev;
                prev = grid[i][j];
            }
        }

        for (int j = 0; j < m; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                grid[i][j] += colSum;
                colSum = grid[i][j];
                if (grid[i][j] <= k) res++;
            }
        }
        return res;
    }
}