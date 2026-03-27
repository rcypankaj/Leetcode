class Solution {
    private void leftShift(int[][] arr, int row) {
        int n = arr[0].length;
        int temp = arr[row][0];
        for (int i = 0; i < n-1; i++) {
            arr[row][i] = arr[row][i+1];
        }
        arr[row][n-1] = temp;
    }
    private void rightShift(int[][] arr, int row) {
        int n = arr[0].length;
        int temp = arr[row][n-1];
        for (int i = n-1; i > 0; i--) {
            arr[row][i] = arr[row][i-1];
        }
        arr[row][0] = temp;
    }
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat.length, m = mat[0].length;
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j =0; j < m; j++) {
                arr[i][j] = mat[i][j];
            }
        }

        while (k-- > 0)
            for (int i = 0; i < n; i++) {
                if ((i&1) == 1) rightShift(arr, i);
                else leftShift(arr, i);
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] != arr[i][j]) return false;
            }
        }
        return true;
    }
}