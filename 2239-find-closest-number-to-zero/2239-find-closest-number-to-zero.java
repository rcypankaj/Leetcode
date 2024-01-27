class Solution {
    public int findClosestNumber(int[] nums) {
        long positiveMin = Integer.MAX_VALUE, negativeMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num >= 0) {
                positiveMin = positiveMin > num ? num : positiveMin;
            } else {
                negativeMax = negativeMax > num ? negativeMax : num;
            }
        }
        return 0 - negativeMax == positiveMin ? (int)positiveMin : 0 - negativeMax > positiveMin ? (int)positiveMin : (int)negativeMax;
        
    }
}