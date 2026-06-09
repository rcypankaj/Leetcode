class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = 0, min = Integer.MAX_VALUE;

        for (int num: nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        return (long)Math.abs(max-min)*k;
    }
}