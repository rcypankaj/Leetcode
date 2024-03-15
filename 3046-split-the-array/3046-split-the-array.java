class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e: map.entrySet()) {
            if (e.getValue() <= 2) {
                count += e.getValue();
            }
        }
        return nums.length%2 == 0 && count == nums.length;
    }
}