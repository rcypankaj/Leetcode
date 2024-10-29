class Solution {
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
            ans = ans* (paths-r+i)/i;
            System.out.println(i+" "+ans+" "+(paths-r+i)/i);
        }
        return (int)ans;
    }
       public int uniquePaths4(int m, int n) {
        int N = n + m - 2;
        int r = m - 1;
        double res = 1;

        for(int i = 1; i <= r; i++){
            res = res * (N-r+i)/i;
        }

        return (int)res;
    }
    public int uniquePaths(int m, int n) {
        // return uniquePaths4(m, n);
        return findUniquePaths2(m, n);

    }
}