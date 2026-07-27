class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxVal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (((nums[i]-1)*(nums[j]-1)) > maxVal) {
                    maxVal = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return maxVal;
    }
}