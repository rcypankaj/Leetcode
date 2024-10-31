class Solution {
    // Brute force
    private int[] findTwoSum1(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }
    // Optimal Approach
    private int[] findTwoSum2(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (freq.containsKey(target - nums[i])) return new int[]{freq.get(target - nums[i]), i};
            else freq.put(nums[i], i);
        }
        return new int[]{};
    }
    public int[] twoSum(int[] nums, int target) {
        return findTwoSum2(nums, target);
    }
}