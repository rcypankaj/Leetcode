class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n < 1) return 0;
        Arrays.sort(nums);
        int count = 1, maxCount = 1;
        for (int i = 0; i < n-1; i++) {

            if (nums[i] == nums[i+1]) {
                continue;
            } else if (nums[i] == nums[i+1]-1) {
                count++;
            } else {
                count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}