class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int n = s1.length();
        if (s1.length() != s2.length()) return false;

        int[] evenIdxChar = new int[26];
        int[] oddIdxChar = new int[26];

        for (int i = 0; i < n; i++) {
            char currChar = s1.charAt(i);
            if ((i&1) == 1)
                oddIdxChar[currChar-'a']++;
            else 
                evenIdxChar[currChar-'a']++;
        }

        for (int i = 0; i < n; i++) {
            char currChar = s2.charAt(i);
            if ((i&1) == 1){
                int val = oddIdxChar[currChar-'a'];
                if (val < 1) return false;
                oddIdxChar[currChar-'a']--;
            }
            else {
                int val = evenIdxChar[currChar-'a'];
                if (val < 1) return false;
                evenIdxChar[currChar-'a']--;
            }
        }
        return true;
    }
}