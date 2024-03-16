class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 0, min = Integer.MAX_VALUE;
        int si1 = -1, ei1 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (si1 == -1 && nums[i] == 1) {
                si1 = i;
            } else if (ei1 == -1 && nums[i] == 1) {
                ei1 = i;
            } else {
                if (nums[i] == 1) {
                    si1 = ei1;
                    ei1 = i;
                }
            }
            if (si1 != -1 && ei1 != -1) min = ei1 - si1 - 1;
            
        }
        return min >= k || (min == Integer.MAX_VALUE && k <= 0);
    }
}