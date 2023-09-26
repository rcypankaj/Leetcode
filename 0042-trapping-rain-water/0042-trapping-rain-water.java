class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            max = Math.max(height[i], max);
            left[i] = max;
        }
        max = 0;
        for (int i = height.length-1; i >= 0; i--) {
            max = Math.max(height[i], max);
            right[i] = max;
        }

        int count = 0;
        for (int i = 0; i < height.length; i++) {
            count += Math.min(left[i], right[i]) - height[i];
        }
        return count;
    }
}
