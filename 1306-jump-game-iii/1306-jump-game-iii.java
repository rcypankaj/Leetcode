class Solution {
    private boolean dfs(int[] arr, int curr, boolean[] visited) {
        if (visited[curr]) return false;

        if (arr[curr] == 0) return true;

        visited[curr] = true;
        
        boolean forward = false, backward = false;
        if (curr+arr[curr] < arr.length) {
            forward = dfs(arr, curr+arr[curr], visited);
        }

        if (curr-arr[curr] >= 0) {
            backward = dfs(arr, curr-arr[curr], visited);
        }
        return forward || backward;

    }
    public boolean canReach(int[] arr, int start) {
        return dfs(arr, start, new boolean[arr.length+1]);
    }
}