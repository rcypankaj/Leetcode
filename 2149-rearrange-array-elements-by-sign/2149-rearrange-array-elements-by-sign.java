class Solution {
    private static int findNextPosIdx(int[] nums, int i ) {
        int n = nums.length;
        while (i < n) {
            if (nums[i] >= 0) return i;
            i++;
        }
        return i;
    }
    private static int findNextNegIdx(int[] nums, int i ) {
        int n = nums.length;
        while (i < n) {
            if (nums[i] < 0) return i;
            i++;
        }
        return i;
    }
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int i = 0, j= 0, it = 0;
        int[] res = new int[n];
        while (i < n && j < n && it < n) {
            if (it%2 == 0) {
                int idx = findNextPosIdx(nums, i);
                if (idx < n) {
                    res[it++] = nums[idx];
                }
                i = idx+1;
            } else {
                int idx = findNextNegIdx(nums, j);
                if (idx < n) {
                    res[it++] = nums[idx];
                }
                j = idx+1;
            }
        }
        if (j < n) {
            res[it] = nums[findNextNegIdx(nums, j)];
        }
        return res;
    }
}