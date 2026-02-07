class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n = nums.size();
        int mid = n/2;
        int i = 0, j = mid;
        int pairs = 0;
        while (i < mid && j < n) {
            if (nums.get(i) < nums.get(j)) {
                i++;
                j++;
                pairs++;
                continue;
            }
            j++;
        }
        return n-2*pairs;
    }
}