class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charArr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char currChar = magazine.charAt(i);
            charArr[currChar - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char currChar = ransomNote.charAt(i);
            charArr[currChar - 'a']--;
        }
        
        for (int val : charArr) {
            if (val < 0) return false;
        }
        return true;
    }
}