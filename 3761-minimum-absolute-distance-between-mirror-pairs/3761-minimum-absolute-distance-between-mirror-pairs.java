class Solution {
    private int reverseNum(int num) {
        int val = 0;
        while (num > 0) {
            val = (val*10)+ num%10;
            num /= 10;
        }
        return val;
    }
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int val = map.getOrDefault(nums[i], -1);
            if (val != -1) {
                res = Math.min(res, i-val);
            }
            map.put(reverseNum(nums[i]), i);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}