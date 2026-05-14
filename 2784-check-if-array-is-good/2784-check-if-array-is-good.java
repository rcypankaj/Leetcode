class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for (int i = 1; i < n-1; i++) {
            if (!map.containsKey(i)) return false;
        }
        return map.getOrDefault(n-1, 0) == 2;
    }
}