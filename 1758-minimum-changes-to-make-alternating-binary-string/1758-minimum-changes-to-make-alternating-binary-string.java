class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int diffBitStr1 = 0, diffBitStr2 = 0;
        for (int i = 0; i < n; i++) {
            char currChar = s.charAt(i);
            char possibleCharZero = (i&1) == 1 ? '1' : '0';
            char possibleCharOne = (i&1) == 1 ? '0' : '1';
            if (currChar != possibleCharZero) {
                diffBitStr1++;
            }
            if (currChar != possibleCharOne) {
                diffBitStr2++;
            }
        }
        return Math.min(diffBitStr1, diffBitStr2);
    }
}