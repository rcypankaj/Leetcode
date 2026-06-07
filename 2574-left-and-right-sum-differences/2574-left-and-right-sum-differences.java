class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        
        int[] res = new int[n];
        int leftSum = 0, rightSum = 0;

        for (int i = n-1; i >= 0; i--) {
            rightSum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            res[i] = Math.abs(leftSum-rightSum);
            leftSum += nums[i];
        }
        return res;
    }
}