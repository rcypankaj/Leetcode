class Solution {
     public boolean validPalindrome(String s) {
        int count = 1;
        int si = 0, ei = s.length()-1;
        while (si < ei) {
            if (s.charAt(si) == s.charAt(ei)) {
                si++;
                ei--;
            } else {
                if (isPalindrome(s, si+1, ei) || isPalindrome(s, si, ei-1)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isPalindrome(String s, int si, int ei) {
        while (si < ei) {
            if (s.charAt(si) != s.charAt(ei)) {
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
}