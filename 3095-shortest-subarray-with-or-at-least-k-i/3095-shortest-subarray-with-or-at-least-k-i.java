class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int bitwiseVal = bitwiseOr(nums, i, j);
                System.out.println(bitwiseVal+" "+i+" "+j);
                if (bitwiseVal >= k) res = Math.min(res, j-i+1);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    public int bitwiseOr(int[] arr, int si, int ei) {
        int bitwiseOr = 0;
        for (int i = si; i <= ei; i++) {
            bitwiseOr |= arr[i];
        }
        return bitwiseOr;
    }
}