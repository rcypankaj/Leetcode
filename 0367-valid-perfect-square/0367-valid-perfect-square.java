class Solution {
    public boolean isPerfectSquare(int num) {
        int count = num;
        // System.out.println(Math.sqrt(2147483647));
        // System.out.println(46340 * 46340);
        for (int i = 1; i*i <= num; i++) {
            if (i * i == count) return true;
            if (i == 46341) {
                break;
            }
        }
        return false;
    }
}