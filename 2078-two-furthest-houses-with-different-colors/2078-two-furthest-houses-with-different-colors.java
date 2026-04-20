class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;

        int left = 0, right = 0;

        for (int i = 0; i < n-1; i++) {
            if (colors[i] != colors[n-1]) {
                left = i;
                break;
            }
        }

        for (int j = n-1; j >= 1; j--) {
            if (colors[j] != colors[0]) {
                right = j;
                break;
            }
        }

        return Math.max(n-1-left, right);
    }
}