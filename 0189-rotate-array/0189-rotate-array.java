class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] numsCopy = new int[n];
        int j = 0;
        for (int i = n-k; i < n; i++) {
            numsCopy[j++] = nums[i];
        }
        for (int i = 0; i < n-k; i++){
            numsCopy[j++] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = numsCopy[i];
        }
    }
}