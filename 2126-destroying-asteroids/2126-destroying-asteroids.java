class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n = asteroids.length;
        Arrays.sort(asteroids);
        long massCopy = mass;

        for (int i = 0; i < n; i++) {
            if (massCopy < asteroids[i]) return false;
            massCopy += asteroids[i];
        }
        return true;
    }
}