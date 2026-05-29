class Solution {
    private static void reverse(int[] arr, int si, int ei) {
        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }
}