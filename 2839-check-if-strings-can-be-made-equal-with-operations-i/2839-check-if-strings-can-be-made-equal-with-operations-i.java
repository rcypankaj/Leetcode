class Solution {
    public boolean canBeEqual(String s1, String s2) {
        Map<Character, Integer> evenIdxChar = new HashMap<>();
        Map<Character, Integer> oddIdxChar = new HashMap<>();
        int n = s1.length();
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < n; i++) {
            char currChar = s1.charAt(i);
            if ((i&1) == 1) 
            oddIdxChar.put(currChar, oddIdxChar.getOrDefault(currChar, 0)+1);
            else 
            evenIdxChar.put(currChar, evenIdxChar.getOrDefault(currChar, 0)+1);
        }

        for (int i = 0; i < n; i++) {
            char currChar = s2.charAt(i);
            if ((i&1) == 1){
                int val = oddIdxChar.getOrDefault(currChar, 0);
                if (val < 1) return false;
                oddIdxChar.put(currChar, oddIdxChar.getOrDefault(currChar, 0)-1);
            }
            else {
                int val = evenIdxChar.getOrDefault(currChar, 0);
                if (val < 1) return false;
                evenIdxChar.put(currChar, evenIdxChar.getOrDefault(currChar, 0)-1);
            }
        }
        return true;
    }
}