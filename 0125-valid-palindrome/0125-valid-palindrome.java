class Solution {
    private boolean isPalindromeFun(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return isPalindromeFun(str, left+1, right-1);
    }
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (Character.isLetterOrDigit(currChar))
                sb.append(Character.toLowerCase(currChar));
        }
        return isPalindromeFun(sb.toString(), 0, sb.length()-1);
    }
}