class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int res = 0, xCopy = x;
        while (xCopy != 0) {
            int rem = xCopy%10;
            res = res*10+rem;
            xCopy/= 10;
        }
        System.out.println(res);
        return res == x;
    }
}