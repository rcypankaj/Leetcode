class Solution {

    // Works on smalltest cases
    private int findUniquePaths1(int[][] arr, int i, int j, int m, int n) {
        if (i == m-1 && j == n-1) return 1;
        else if (i >= m || j >= n) return 0;

        if (arr[i][j] > 0) return arr[i][j];
        return arr[i][j] = findUniquePaths1(arr, i+1, j, m, n) + findUniquePaths1(arr, i, j+1, m, n);
    }
    private int findUniquePaths2(int m, int n) {
        // total steps
        int paths = m+n-2;
        int r = m-1;
        double ans = 1;
        for (int i = 1; i <= r; i++) {
            System.out.println(i);
            ans *= (paths-r+i)/i;
        }
        return (int)ans;
    }
    public int uniquePaths(int m, int n) {
        return findUniquePaths1(new int[m][n], 0, 0, m, n);
    }
}