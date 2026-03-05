class Solution {
    private String formStr(int len, boolean isZero) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (isZero) {
                sb.append(0);
            } else sb.append(1);
            isZero = !isZero;
        }
        return sb.toString();
    }
    public int minOperations(String s) {
        int n = s.length();
        String possibleStr1 = formStr(n, true);
        String possibleStr2 = formStr(n, false);
        int diffBitStr1 = 0, diffBitStr2 = 0;
        for (int i = 0; i < n; i++) {
            char currChar = s.charAt(i);
            if (currChar != possibleStr1.charAt(i)) {
                diffBitStr1++;
            }
            if (currChar != possibleStr2.charAt(i)) {
                diffBitStr2++;
            }
        }
        return Math.min(diffBitStr1, diffBitStr2);
    }
}