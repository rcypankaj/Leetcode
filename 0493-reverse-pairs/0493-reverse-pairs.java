class Solution {
    private int countPairs(int[] nums, int si, int mid, int ei) {
        int count = 0;
        int right = mid +1;
        for (int i = si; i <= mid; i++) {
            while (right <= ei && nums[i] > (long)nums[right]*2) {
                right++;
            }
            count += (right-(mid+1));
        }
        return count;
    }
    private void conquer(int[] nums, int si, int mid, int ei) {
        int[] merger = new int[(ei-si)+1];
        int idx1 = si;
        int idx2 = mid+1;
        int count = 0;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (nums[idx1] <= nums[idx2]) {
                merger[x++] = nums[idx1++];
            } else {
                merger[x++] = nums[idx2++];
            }
        }

        while (idx1 <= mid) {
            merger[x++] = nums[idx1++];
        }
        while (idx2 <= ei) {
            merger[x++] = nums[idx2++];
        }

        for (int i = 0, j = si; i < merger.length; i++, j++) {
            nums[j] = merger[i];
        }
    }
    // Using Brute Force
    private int findReversePairs1(int[] nums, int si, int ei) {
        int count = 0;
        if (si >= ei) return count;

        int mid = si + (ei -si)/2;
        
        count += findReversePairs1(nums, si, mid);
        count += findReversePairs1(nums, mid+1, ei);
        count += countPairs(nums, si, mid, ei);
        conquer(nums, si, mid, ei);
        return count;
    }
    public int reversePairs(int[] nums) {
        int cou =  findReversePairs1(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
        return cou;
    }
}