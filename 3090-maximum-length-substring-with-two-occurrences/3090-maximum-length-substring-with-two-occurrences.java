class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                // System.out.println(s.substring(i, j));
                boolean isValid = count(s.substring(i, j));
                if (isValid)
                    maxLength = Math.max(s.substring(i, j).length(), maxLength);
            }
        }
        return maxLength;
    }
    public boolean count(String str) {
        Map<Character, Integer> charSet = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            charSet.put(str.charAt(i), charSet.getOrDefault(str.charAt(i), 0) +1);
        }
        for (Map.Entry<Character, Integer> e : charSet.entrySet()) {
            if (e.getValue() > 2) {
                return false;
            }
        }
        return true;
    }
}