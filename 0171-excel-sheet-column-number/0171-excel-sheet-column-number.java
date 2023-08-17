class Solution {
    public int titleToNumber(String columnTitle) {
        int iterator = 0;
        int res = 0;
        for (int i = columnTitle.length()-1; i >= 0; i--) {
            char character = columnTitle.charAt(i);
            int digit = character - 'A' + 1;
            int num = (int)Math.pow(26, iterator) * digit;
            res += num;

            // System.out.println(digit+" "+num);
            iterator++;
        }
        return res;
    }
}