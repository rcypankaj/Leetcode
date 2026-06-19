class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0, gainAlt = 0;
        for (int alt: gain) {
            gainAlt += alt;
            maxAltitude = Math.max(maxAltitude, gainAlt);
        }
        return maxAltitude;
    }
}