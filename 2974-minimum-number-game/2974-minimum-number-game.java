class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int[] sortedArr = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArr[i] = nums[i];
        }
        Arrays.sort(sortedArr);
        int[] res = new int[n];
        for (int i = 0; i < n; i += 2) {
            res[i] = sortedArr[i+1];
            res[i+1] = sortedArr[i];
        }
        return res;
    }
}