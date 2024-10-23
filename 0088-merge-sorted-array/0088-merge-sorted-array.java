class Solution {
    public void swapVal(int[] nums1, int[] nums2, int i, int j) {
        nums1[i] = nums1[i] + nums2[j];
        nums2[j] = nums1[i] - nums2[j];
        nums1[i] = nums1[i] - nums2[j];
    }
    public void mergeUsingBruteForce(int[] nums1, int[] nums2, int m, int n) {
        if (n == 0) return;
        int length1 = nums1.length;
        int[] result = new int[length1];
        int start = 0, end = 0, idx = 0;
        while (start < m && end < n) {
            if (nums1[start] <= nums2[end]) {
                result[idx++] = nums1[start++];
            } else {
                result[idx++] = nums2[end++];
            }
        }

        while (start < m) {
            result[idx++] = nums1[start++];
        }
        while (end < n) {
            result[idx++] = nums2[end++];
        }
        for (int i = 0; i < length1; i++) {
            nums1[i] = result[i];
        }
    }

    public void mergeWithoutExtraSpace(int[] nums1, int[] nums2, int m, int n) {
        int left = 0, right = 0;
        while (left >= 0 && right < n) {
            if (nums1[left] > nums2[right]) {
                swapVal(nums1, nums2, left, right);
                left--;
                right++;
            } else break;

        }

        for (int i = n, j = 0; i < m+n; i++) {
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        mergeUsingBruteForce(nums1, nums2, m, n);
    }
}