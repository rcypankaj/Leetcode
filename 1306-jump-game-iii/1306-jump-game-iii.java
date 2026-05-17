class Solution {
    private boolean dfs(int[] A, int i) {
        return 0 <= i &&
           i < A.length &&
           A[i] >= 0 &&
           ((A[i] = -A[i]) == 0 ||
            canReach(A, i + A[i]) ||
            canReach(A, i - A[i]));

    }
    public boolean canReach(int[] arr, int start) {
        return dfs(arr, start);
    }
}