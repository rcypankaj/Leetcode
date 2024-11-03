class Solution {
    private int findLengthOfLongestSubstring1(String s) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Set<Character> charSet = new HashSet<>();
                for (int k = i; k <= j; k++) {
                    charSet.add(s.charAt(k));
                }
                if (charSet.size() == j-i+1) maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }
    private int removeDuplicate(Set<Character> charSet, String s, char ch, int l, int r) {
        int n = s.length();
        while (charSet.contains(ch)) {
            charSet.remove(s.charAt(l++));
        }
        return l;
    }
    private int findLengthOfLongestSubstring2(String s) {
        int n = s.length();
        Set<Character> charSet =  new HashSet<>();
        int maxLen = 0;
        int l = 0, r = 0;
        while (r < n) {
            char currChar = s.charAt(r);
            if (!charSet.contains(currChar)) {
                maxLen = Math.max(r-l+1, maxLen);
                charSet.add(currChar);
                r++;
            } else {
                l = removeDuplicate(charSet, s, currChar, l, r);
                maxLen = Math.max(r-l+1, maxLen);
                charSet.add(currChar);
                r++;
            }
        }
        return maxLen;
    }
    public int lengthOfLongestSubstring(String s) {
        // Brute force
        // return findLengthOfLongestSubstring1(s);
        // Better Approach
        return findLengthOfLongestSubstring2(s);
        
    }
}