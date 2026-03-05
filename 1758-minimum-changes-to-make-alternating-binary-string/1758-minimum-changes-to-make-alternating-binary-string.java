class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int missmatch = 0;
        for (int i = 0; i < n; i++) {
            char currChar = s.charAt(i);
            char possibleCharZero = (i&1) == 1 ? '1' : '0';
            if (currChar != possibleCharZero) {
                missmatch++;
            }
        }
        return Math.min(missmatch, n-missmatch);
    }
}