class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length;
        int[] arr = new int[m * n];
        int k = 0, base = grid[0][0];
        
        for (int[] row : grid) {
            for (int v : row) {
                if ((v - base) % x != 0) return -1;
                arr[k++] = v;
            }
        }
        
        java.util.Arrays.sort(arr);
        int median = arr[arr.length / 2];
        
        int ops = 0;
        for (int v : arr) {
            ops += Math.abs(v - median) / x;
        }
        
        return ops;
    }
}