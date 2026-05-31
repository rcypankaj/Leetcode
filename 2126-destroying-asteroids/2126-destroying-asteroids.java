class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long massCopy = mass;

        for (int asteroid : asteroids) {
            if (massCopy < asteroid) return false;
            massCopy += asteroid;
        }
        return true;
    }
}