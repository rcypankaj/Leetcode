class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] != 1) continue;
                
                boolean valid = true;
                for (int r = 0; r < n; r++) {
                    if (mat[r][j] == 1 && r != i) {
                        valid = false;
                        break;
                    }
                }
                for (int c = 0; c < m; c++) {
                    if (mat[i][c] == 1 && c != j) {
                        valid = false;
                        break;
                    }
                }
                if (valid)
                    res++;
            }
        }
        return res;
    }
}