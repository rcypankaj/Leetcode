class Solution {
    public boolean isSpecialIdx(int[][] mat, int row, int col) {
        int n = mat.length, m = mat[0].length;
        int count1InRow = 0, count1InCol = 0;
        for (int i = 0; i < m; i++) {
            if (mat[row][i] == 1) {
                count1InRow++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (mat[i][col] == 1 && row != i) {
                count1InCol++;
            }
        }
        return (count1InRow+count1InCol) == 1;
    }
    public int numSpecial(int[][] mat) {
        int res = 0;
        int n = mat.length;
        int m = mat[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1)
                    if (isSpecialIdx(mat, i, j)) {
                        res++;
                    }
            }
        }
        return res;
    }
}