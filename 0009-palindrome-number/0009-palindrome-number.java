class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int rev = 0;
        int xCopy = x;
        while (xCopy != 0) {
            int rem = xCopy%10;
            if (rev > Integer.MAX_VALUE/10) return false;
            rev = (rev*10) + rem;
            xCopy /= 10;
        }
        return rev == x;
    }
}