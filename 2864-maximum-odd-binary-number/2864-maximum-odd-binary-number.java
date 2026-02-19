class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            char currChar = s.charAt(i);
            if (currChar == '1') count1++;
        }
        for (int i = 0; i < n-1; i++) {
            if (count1-- > 1) sb.append('1');
            else {
                sb.append('0');
            }
        }
        sb.append('1');
        return sb.toString();

    }
}