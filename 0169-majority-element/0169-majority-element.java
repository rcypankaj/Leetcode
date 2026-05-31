class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for (int num: nums) {
            int val = map.getOrDefault(num, 0);
            map.put(num, val+1);
            if (val >= n/2) res = num;
        }
        return res;
    }
}