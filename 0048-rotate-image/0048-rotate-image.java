class Solution {
    private void swap(int[][] matrix, int i, int j, int k, int l) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[k][l];
        matrix[k][l] = temp;
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
               swap(matrix, i, j, j, i);
            }
        }

        for (int i = 0; i < n; i++) {
            int j = 0, k = m-1;
            while (j < k) {
                swap(matrix, i, j, i, k);
                j++;
                k--;
            }
        }
    }
}