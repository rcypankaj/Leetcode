class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 0, len = 0, lastMin = Integer.MIN_VALUE;
        Arrays.sort(nums);

        for (int num: nums) {
            if (num-1 == lastMin) {
                lastMin = num;
                len++;
            } else if (num == lastMin) continue;
            else {
                len = 1;
                lastMin = num;
            }
            maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }
}