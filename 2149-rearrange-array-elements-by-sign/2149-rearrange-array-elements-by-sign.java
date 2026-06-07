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
        int i = 0, j= 1;
        int[] res = new int[n];
        for (int num: nums) {
            if (num > 0) {
                res[i] = num;
                i += 2;
            } else {
                res[j] = num;
                j += 2;
            }
        }
        return res;
    }
}