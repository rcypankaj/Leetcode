class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                HashMap<Character, Integer> map = new HashMap<>();
                for (int k = i; k <= j; k++) {
                    char currChar = s.charAt(k);
                    map.put(currChar, map.getOrDefault(currChar, 0)+1);
                }
                boolean isValidSubStr = true;
                for (Map.Entry<Character, Integer> e: map.entrySet()) {
                    if (e.getValue() > 2) isValidSubStr = false;
                }
                if (isValidSubStr) {
                    maxLen = Math.max(j-i+1, maxLen);
                }
            }
        }
        return maxLen;
    }
}