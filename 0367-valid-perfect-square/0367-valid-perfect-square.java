class Solution {
    public boolean isPerfectSquare(int num) {
        for (int i = 1; i*i <= num; i++) {
            if (i * i == num) return true;
            if (i == 46341) {
                break;
            }
        }
        return false;
    }
}