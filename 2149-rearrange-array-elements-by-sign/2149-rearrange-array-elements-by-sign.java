class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) neg.add(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) pos.add(nums[i]);
        }
        int posIdx = 0, negIdx = 0, it = 0;
        for (int i = 0; i < n; i++) {
            if (i%2 == 0) {
                nums[i] = pos.get(posIdx++);
            } else {
                nums[i] = neg.get(negIdx++);
            }
        }
        return nums;
    }
}