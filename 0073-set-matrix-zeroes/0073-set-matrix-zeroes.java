class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean zeroinFirstRow = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        zeroinFirstRow = true;
                    } else {
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = m-1; j >= 0; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        // System.out.println(zeroinFirstRow + "zeroinFirstRow");
        if (zeroinFirstRow)
            for (int i = 0; i < m; i++)
                matrix[0][i] = 0;
    }
}