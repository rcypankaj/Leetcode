class Solution {
    private void rotate90(int[][] mat) {
        int n = mat.length;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][n-i-1] = mat[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.arraycopy(arr[i], 0, mat[i], 0, n);
        }
    }
    private boolean isEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target)) return true;
            rotate90(mat);
        }
        return false;
    }
}