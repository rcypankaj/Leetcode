class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for (char character : columnTitle.toCharArray()) {
            res *= 26;
            res += character - 'A' + 1;
        }
        return res;
    }
}