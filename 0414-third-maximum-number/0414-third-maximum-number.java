class Solution {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int count = 3;
        for (int i = nums.length-1; i >= 0; i--) {
            if (count > 0 && !set.contains(nums[i])) {
                count--;
                if (count == 0) {
                    return nums[i];
                }
                set.add(nums[i]);
            }
        }
        return max;
    }
}