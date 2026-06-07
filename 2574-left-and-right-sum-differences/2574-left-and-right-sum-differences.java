class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSumNum = 0;
        int[] leftSum = new int[n];

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            leftSum[i] = leftSumNum;
            leftSumNum += nums[i];
        }

        int rightSumNum = 0;
        int[] rightSum = new int[n];

        for (int i = n-1; i >= 0; i--) {
            rightSum[i] = rightSumNum;
            rightSumNum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            res[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return res;
    }
}