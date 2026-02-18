class Solution {
    public boolean hasAlternatingBits(int n) {
        int lastBit = -1;
        int num = n;
        while (num > 0) {
            int currBit = num&1;
            if (currBit == lastBit) return false;
            lastBit = currBit;
            num = num >> 1;
        }
        return true;
    }
}