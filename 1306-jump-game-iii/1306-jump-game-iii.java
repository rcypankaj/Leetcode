class Solution {
    private boolean dfs(int[] arr, int i) {
        if (i >= arr.length || i < 0) return false;


        if (arr[i] == 0) return true;
        if (arr[i] < 0) return false;

        arr[i] = -arr[i];
        
        return dfs(arr, i+arr[i]) || dfs(arr, i-arr[i]);

    }
    public boolean canReach(int[] arr, int start) {
        return dfs(arr, start);
    }
}