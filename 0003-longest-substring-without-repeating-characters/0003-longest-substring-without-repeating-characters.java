class Solution {
    private int findLengthOfLongestSubstring3(String s) {
        int n = s.length();
        Map<Character, Integer> freqMap =  new HashMap<>();
        int maxLen = 0;
        int l = 0, r = 0;
        while (r < n) {
            char currChar = s.charAt(r);
            if (freqMap.containsKey(currChar)) l = Math.max(freqMap.get(currChar)+1, l);
            freqMap.put(currChar, r);
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
    private int findLengthOfLongestSubstring1(String s) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> charSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                char currChar = s.charAt(j);
                if (charSet.contains(currChar)) {
                    maxLen = Math.max(maxLen, j-i);
                    break;
                } else {
                    maxLen = Math.max(maxLen, j-i+1);
                    charSet.add(currChar);
                }
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
        // return findLengthOfLongestSubstring2(s);

        // Optimal Approach
        return findLengthOfLongestSubstring3(s);
        
    }
}