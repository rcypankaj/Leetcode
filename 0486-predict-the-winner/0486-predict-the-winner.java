class Solution {
    private int solve(int[] nums, int i, int j) {
        if (i == j) return nums[i];

        int pickLeft = nums[i] - solve(nums, i+1, j);
        int pickRight = nums[j] - solve(nums, i, j-1);
        return Math.max(pickLeft, pickRight);
    }
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        return solve(nums, 0, n-1) >= 0;
    }
}