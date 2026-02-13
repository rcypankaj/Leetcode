class Solution {
    public boolean isValid(String str) {
        int n = str.length();
        if (n <= 1) return true;
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[str.charAt(i) - 'a']++;
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, freq[str.charAt(i) - 'a']);
            max = Math.max(max, freq[str.charAt(i) - 'a']);
        }
        return min == max;
    }
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                char currChar = s.charAt(j);
                freq[currChar-'a']++;
                int min = Integer.MAX_VALUE;
                int max = 0;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        min = Math.min(min, freq[k]);
                        max = Math.max(max, freq[k]);
                    }
                }
                if (min == max) {
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }
}