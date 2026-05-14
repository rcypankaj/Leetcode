class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i < n-2 && nums[i] != i+1) return false;
            else if (i >= n-2 && nums[i] != n-1) return false;
        }
        return true;
    }
}