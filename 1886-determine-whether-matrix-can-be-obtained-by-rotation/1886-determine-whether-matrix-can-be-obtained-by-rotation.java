class Solution {
    private void roate90(int[][] mat) {
        int n = mat.length;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][n-i-1] = mat[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = arr[i][j];
            }
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
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = mat[i][j];
            }
        }

        int noOfTimeRotate = 4;
        while (noOfTimeRotate-- > 0) {
            roate90(arr);
            if (isEqual(arr, target)) return true;
        }
        return false;
    }
}