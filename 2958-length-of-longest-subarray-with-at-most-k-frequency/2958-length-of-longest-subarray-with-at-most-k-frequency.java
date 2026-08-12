class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxLen = 0;
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0)+1);

            while (freq.get(nums[right])>k) {
                freq.put(nums[left], freq.getOrDefault(nums[left], 0)-1);
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}