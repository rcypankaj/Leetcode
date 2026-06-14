class Solution {
    private void setZeroesToParticularRowCols(int[][] nums, int row, int col) {
        int n = nums.length, m = nums[0].length;
        for (int i = 0; i < n; i++) {
            nums[i][col] = 0;
        }

        for (int i = 0; i < m; i++) {
            nums[row][i] = 0;
        }
        
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}