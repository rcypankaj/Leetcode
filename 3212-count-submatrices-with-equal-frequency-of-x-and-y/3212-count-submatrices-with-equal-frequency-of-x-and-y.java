class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        int res = 0;

        int[][] xCount = new int[n][m];
        int[][] yCount = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 'X') xCount[i][j] = 1;
                if (grid[i][j] == 'Y') yCount[i][j] = 1;

                if (i > 0) {
                    xCount[i][j] += xCount[i-1][j];
                    yCount[i][j] += yCount[i-1][j];
                }
                if (j > 0) {
                    xCount[i][j] += xCount[i][j-1];
                    yCount[i][j] += yCount[i][j-1];
                }
                if (i > 0 && j > 0) {
                    xCount[i][j] -= xCount[i-1][j-1];
                    yCount[i][j] -= yCount[i-1][j-1];
                }

                if (xCount[i][j] > 0 && xCount[i][j] == yCount[i][j]) {
                    res++;
                }
            }
        }

        return res;
    }
}