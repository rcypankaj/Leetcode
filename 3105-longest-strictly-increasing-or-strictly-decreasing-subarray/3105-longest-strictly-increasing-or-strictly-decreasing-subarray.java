class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (isStrictlyIncreasing(nums, i, j) || isStrictlyDecreasing(nums, i, j)) {
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }
    public boolean isStrictlyIncreasing(int[] nums, int si, int ei) {
        for (int i = si; i <= ei-1; i++) {
            if (nums[i] < nums[i+1]) continue;
            else return false;
        }
        return true;
    }
    public boolean isStrictlyDecreasing(int[] nums, int si, int ei) {
        for (int i = si; i <= ei-1; i++) {
            if (nums[i] > nums[i+1]) continue;
            else return false;
        }
        return true;
    }
}