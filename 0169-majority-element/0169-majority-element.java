class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int currEl = 0, count = 0;
        for (int num: nums) {
            if (count == 0) {
                currEl = num;
                count++;
            } else if (currEl == num) count++;
            else {
                count--;
            }
        }
        return currEl;
    }
}