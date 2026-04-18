class Solution {
    private int reverseNum(int n) {
        int val = 0;
        while (n > 0) {
            val = (val*10)+n%10;
            n /= 10;
        }
        return val;
    }
    public int mirrorDistance(int n) {
        int reverseN = reverseNum(n);
        return Math.abs(n-reverseN);
    }
}