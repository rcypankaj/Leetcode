class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = -1;;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else count = 0;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}