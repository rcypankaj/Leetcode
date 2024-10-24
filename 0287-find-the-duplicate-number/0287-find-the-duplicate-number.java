class Solution {
    public int findDuplicateUsingBruteForce(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+1];
        int num = -1;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        for (int i = 1; i < n+1; i++) {
            if (arr[i] > 1) {
                return i;
            }
        }
        return -1;
    }
    public int findDuplicate(int[] nums) {
        return findDuplicateUsingBruteForce(nums);
    }
}