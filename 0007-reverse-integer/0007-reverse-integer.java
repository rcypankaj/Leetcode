class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;

        String str = Integer.toString(Math.abs(x));
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        try {
            int result = Integer.parseInt(sb.toString());
            return isNegative ? -result : result;
        } catch (NumberFormatException e) {
            return 0; // overflow case
        }
    }
}