class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        Arrays.fill(prefix, 1);
        Arrays.fill(suffix, 1);

        for (int i = 0; i < n; i++) {
            prefix[i] = i == 0 ? nums[i] : prefix[i-1] * nums[i];
        }
        for (int i = n-1; i >= 0; i--) {
            suffix[i] = i == n-1 ? nums[i] : nums[i] * suffix[i+1];
        }
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                res[i] = suffix[i+1];
            } else if (i == n-1) {
                res[i] = prefix[i-1];
            } else {
                res[i] = prefix[i-1]* suffix[i+1];
            }
        }
        return res;
    }
}