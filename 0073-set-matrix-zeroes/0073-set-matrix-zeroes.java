class Solution {
    public void entireRow(int[][] arr, int i, int j, boolean[][] flag) {
        int k = 0, m = arr[0].length;
        while (k < m) {
            if (k > j && arr[i][k] == 0) {
                k++;
                continue;
            }
            flag[i][k++] = true;
            // arr[i][k++] = -1;
        }
    }
    public void entireCol(int[][] arr, int i, int j, boolean[][] flag) {
        int k = 0, n = arr.length;
        while (k < n) {
            if (k > i && arr[k][j] == 0) {
                k++;
                continue;
            }
            // arr[k++][j] = -1;
            flag[k++][j] = true;
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean[][] flag = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0 && flag[i][j] != true) {
                    entireRow(matrix, i, j, flag);
                    entireCol(matrix, i, j, flag);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (flag[i][j] == true) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}