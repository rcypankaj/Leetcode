class Solution {
    public int bitwiseComplement(int n) {
        String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (sb.charAt(i) == '0') sb.setCharAt(i, '1');
            else sb.setCharAt(i, '0');
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}