class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int idx = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i-1] > nums[i]) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);

        for (int i = 0; i < n-1; i++) {
            if (nums[idx%n] > nums[(idx+1)%n]) return false;
            idx++;
        }
        return true;
    }
}