class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 0;
        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }

        for (int num: set) {
            if (!set.contains(num-1)) {
                int count = 1, expectedVal = num+1;
                while (set.contains(expectedVal)) {
                    count++;
                    expectedVal++;
                }
                maxLen = Math.max(count, maxLen);
            }
        }
        return maxLen;

    }
}