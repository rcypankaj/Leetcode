class Solution {
    // Find duplicate using likedlist cucle method
    public int findDuplicate2(int[] nums) {
        int slow = nums[0], fast = nums[0];

        // Finding the first intersection
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
            
        // We got first intersection
        } while (slow != fast);

        int slow2 = nums[0];
        // Finding the second intersection that will be our result
        while (slow2 != slow) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        return slow;
    }
    public int findDuplicateUsingBruteForce(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+1];
        int num = -1;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        for (int i = 1; i < n+1; i++) {
            if (arr[i] > 1) {
                return i;
            }
        }
        return -1;
    }
    public int findDuplicate(int[] nums) {
        return findDuplicate2(nums);
    }
}