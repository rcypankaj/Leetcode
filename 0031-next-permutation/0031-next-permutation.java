class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void sort(int[] nums, int breakPoint) {
        int n = nums.length;
        int i = breakPoint, j = n-1;
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakPoint = -1;

        for (int i = n-1; i > 0; i--) {
            if (nums[i-1] < nums[i]) {
                System.out.println(nums[i]+" "+nums[i-1]);
                breakPoint = i;
                break;
            }
        }
        System.out.println(breakPoint);

        if (breakPoint == -1) {
            int i = 0, j = n-1;
            while (i < j) {
                swap(nums, i++, j--);
            }
            return;
        }

        for (int i = n-1; i >= breakPoint; i--) {
            if (nums[i] > nums[breakPoint-1]){
                swap(nums, i, breakPoint-1);
                break;
            }
        }
        System.out.println(Arrays.toString(nums));

        sort(nums, breakPoint);
    }
}