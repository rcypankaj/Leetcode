class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int minDiff = Integer.MAX_VALUE;

        for (List<Integer> list: map.values()) {
            int m = list.size();
            if (m < 3) continue;

            for (int i = 0; i < m-2; i++) {
                int firstIdx = list.get(i);
                int lastIdx = list.get(i+2);
                minDiff = Math.min(minDiff, 2*(lastIdx-firstIdx));
            }
        }

        return minDiff == Integer.MAX_VALUE ? -1 : minDiff;
        
    }
}