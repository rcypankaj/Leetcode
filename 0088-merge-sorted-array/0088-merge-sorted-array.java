class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, it = 0;
        int[] res = new int[n+m];
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[it++] = nums1[i++];
            } else {
                res[it++] = nums2[j++];
            }
        }
        while (i < m) {
            res[it++] = nums1[i++];
        }
        while (j < n) {
            res[it++] = nums2[j++];
        }
        i = 0;

        for (i = 0; i < res.length; i++) {
            nums1[i] = res[i];
        }
    }
}