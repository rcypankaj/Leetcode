class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0, max2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[maxIndex]) continue;
             if (max2 == -1) {
                 max2 = i;
             } else if (nums[max2] < nums[i] && nums[i] != nums[maxIndex]) {
                max2 = i;
            }
        }
        System.out.println(nums[maxIndex]+" "+nums[max2]);
        return nums[maxIndex] >= nums[max2] * 2 ? maxIndex : -1;
    }
}