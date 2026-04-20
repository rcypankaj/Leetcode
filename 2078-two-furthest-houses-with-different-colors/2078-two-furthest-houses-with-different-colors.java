class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;

        int maxDiff = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (colors[j] != colors[i]) {
                    maxDiff = Math.max(maxDiff, Math.abs(i-j));
                }
            }
        }
        return maxDiff;
    }
}