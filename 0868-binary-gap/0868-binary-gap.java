class Solution {
    public int binaryGap(int n) {
        int maxDiff = 0;
        int lastIdx = 0;
        String str = Integer.toBinaryString(n);
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            char currChar = str.charAt(i);
            if (currChar == '1') {
                lastIdx = i;
                break;
            }
        }

        for (int i = lastIdx +1; i < strLen; i++) {
            char currChar = str.charAt(i);
            if (currChar == '1') {
                maxDiff = Math.max(maxDiff, i-lastIdx);
                lastIdx = i;
            }
        }
        return maxDiff;
    }
}