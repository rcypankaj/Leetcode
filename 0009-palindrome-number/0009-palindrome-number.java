class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int res = 0, temp = x;
        while (temp != 0) {
            int rem = temp%10;
            res = res*10+rem;
            temp/= 10;
        }
        System.out.println(res);
        return res == x;
    }
}