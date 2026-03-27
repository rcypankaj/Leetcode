class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat.length, m = mat[0].length;

        k %= m;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int newIdx = -1;
                if ((j&1) == 1) newIdx = (j-k+m)%m;
                else newIdx = (j+k)%m;
                if (mat[i][newIdx] != mat[i][j]) return false;
            }
        }
        return true;
    }
}