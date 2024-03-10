class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0, max2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[maxIndex]) continue;
             if (max2 == -1) {
                 max2 = i;
             } else if (nums[max2] < nums[i] && nums[i] != nums[maxIndex]) {
                max2 = i;
            }
        }
        return nums[maxIndex] >= nums[max2] * 2 ? maxIndex : -1;
    }
}