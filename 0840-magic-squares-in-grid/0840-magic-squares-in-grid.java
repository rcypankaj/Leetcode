class Solution {
    public boolean isMagic(int[][] grid, int r, int c) {
        if (grid[r+1][c+1] != 5) return false;
        boolean[] seen = new boolean[10];
        for (int i = r; i < r+3; i ++) {
            for (int j = c; j < c+3; j++) {
                int val = grid[i][j];
                if (val > 9 || val < 1 || seen[val] == true) return false;
                seen[val] = true;
            }
        }
        for (int i = r; i < r+3; i++) {
            int rowSum = 0;
            rowSum = grid[i][c]+ grid[i][c+1] + grid[i][c+2];
            if (rowSum != 15) return false;
        }

        for (int i = c; i < c+3; i++) {
            int colSum = 0;
            colSum = grid[r][i]+ grid[r+1][i] + grid[r+2][i];
            if (colSum != 15) return false;
        }

        int diagonalSum = grid[r][c]+ grid[r+1][c+1]+grid[r+2][c+2];
        int reverseDiagonal = grid[r][c+2] + grid[r+1][c+1] + grid[r+2][c];

        
        return diagonalSum == 15 && reverseDiagonal == 15;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for (int i = 0; i <= n-3; i++) {
            for (int j = 0; j <= m-3; j++) {
                if (isMagic(grid, i, j)) count++;
            }
        }
        return count;
    }
}