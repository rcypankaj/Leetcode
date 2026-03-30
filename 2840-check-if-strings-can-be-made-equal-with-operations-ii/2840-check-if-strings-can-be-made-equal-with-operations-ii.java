class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n = s1.length();
        int[] evenIdx = new int[26];
        int[] oddIdx = new int[26];

        if (n != s2.length()) return false;

        for (int i = 0; i < n; i++) {
            char currChar = s1.charAt(i);
            if ((i&1) == 1) {
                evenIdx[currChar-'a']++;
            } else oddIdx[currChar-'a']++;
        }
        for (int i = 0; i < n; i++) {
            char currChar = s2.charAt(i);
            if ((i&1) == 1) {
                int val = evenIdx[currChar-'a'];
                if (val < 1) return false;
                evenIdx[currChar-'a']--;
            } else {
                int val = oddIdx[currChar-'a'];
                if (val < 1) return false;
                oddIdx[currChar-'a']--;
            }
        }
        for (int num: evenIdx) {
            if (num > 1) return false; 
        }

        for (int num: oddIdx) {
            if (num > 1) return false; 
        }
        return true;
        
    }
}