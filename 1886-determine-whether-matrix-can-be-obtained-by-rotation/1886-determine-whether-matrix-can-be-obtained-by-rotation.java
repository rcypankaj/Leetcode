class Solution {
    private void rotate90(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = temp;
            }
        }
        for (int r = 0; r < n; r++) {
            int i = 0, j = n-1;
            while (i < j) {
                int temp = mat[r][i];
                mat[r][i] = mat[r][j];
                mat[r][j] = temp;
                i++;
                j--;
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
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target)) return true;
            rotate90(mat);
        }
        return false;
    }
}