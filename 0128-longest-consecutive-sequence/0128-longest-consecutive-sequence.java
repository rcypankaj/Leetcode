class Solution {
    // Optimal approach
    private int findConsecutives(int num, Set<Integer> freq) {
        int len = 0;
        while (freq.contains(num)) {
            num++;
            len++;
        }
        return len;
    }
    private int findLongestConsecutive3(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        Set<Integer> freq = new HashSet<>();
        for (int num : nums) {
            freq.add(num);
        }

        int max_len = Integer.MIN_VALUE;
        for (int num: nums) {
            if (freq.contains(num-1)) continue;
            else {
                max_len = Math.max(max_len, findConsecutives(num, freq));
            }
        }
        return max_len;
    }
    // Better approach 
    private int findLongestConsecutive2(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int max_len = 1;
        int len = 1;
        int num = nums[0] + 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i-1]) continue;
            else if (nums[i] == num) {
                len++;
                num++;
                max_len = Math.max(len, max_len);
            } else {
                num = nums[i]+1;
                len = 1;
                max_len = Math.max(len, max_len);
            }
        }

        return max_len;
    }
    // Brute force approach
    private boolean isPresent(int[] nums, int num) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == num) return true;
        }
        return false;
    }
    private int findLongestConsecutive1(int[] nums) {
        int n = nums.length;
        int max_length = 0;
        for (int i = 0; i < n; i++ ){
            int length = 0;
            int num = nums[i];
            while (isPresent(nums, num)) {
                length++;
                num++;
            }
            max_length = Math.max(max_length, length);
        }
        return max_length;
    }
    public int longestConsecutive(int[] nums) {
        // return findLongestConsecutive1(nums);
        return findLongestConsecutive2(nums);
        // return findLongestConsecutive3(nums);
    }
}