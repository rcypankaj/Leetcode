class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] freqArr = new int[101];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            freqArr[nums[i]]++;
        }
        for (int num : freqArr) {
            if (num <= 2) {
                count += num;
            }
        }
        
        return nums.length%2 == 0 && count == nums.length;
    }
}