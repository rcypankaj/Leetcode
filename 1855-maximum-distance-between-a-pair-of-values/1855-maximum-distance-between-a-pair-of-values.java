class Solution {
    private int finMaxDiff(int[] nums, int target, int targetIdx) {
        int left = targetIdx, right = nums.length-1;
        int maxDiff = 0;
        while (left <= right) {
            int mid = (left+right)/2;
            if (target <= nums[mid]) {
                maxDiff = Math.max(maxDiff, mid-targetIdx);
                left = mid+1;
            } else right = mid-1;
        }
        return maxDiff;
    }
    public int maxDistance(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, finMaxDiff(nums2, nums1[i], i));
        }
        return res;
    }
}