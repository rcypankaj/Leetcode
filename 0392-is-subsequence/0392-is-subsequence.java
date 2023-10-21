class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < t.length() && j < s.length()) {
            char currCharS = t.charAt(i);
            if (currCharS == s.charAt(j)) {
                j++;
            } 
            i++;
        }
        return j == s.length();
    }
}