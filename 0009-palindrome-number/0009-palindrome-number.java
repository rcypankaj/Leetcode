class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int si = 0;
        int ei = s.length() - 1;
        while (si < ei) {
            if (s.charAt(si) != s.charAt(ei)) return false;
            
            si++;
            ei--;
        }
        return true;
        
    }
}