class Solution {
    public int hammingDistance(int x, int y) {
        int xorVal = (x ^ y);
        int count =0;
        while (xorVal > 0) {
            count = (xorVal & 1) == 1 ? count+1 : count;
            xorVal >>= 1;
        }
        return count;
    }
}