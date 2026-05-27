class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int[] charArr = new int[26];
        int[] charIdx = new int[26];
        int pair = 0;
        for (int i = 0; i < n; i++) {
            char currChar = word.charAt(i);
            if(Character.isUpperCase(currChar) && charIdx[Character.toLowerCase(currChar) - 'a'] < 1) {
                charIdx[Character.toLowerCase(currChar) - 'a'] = i+1;
            } else if (Character.isLowerCase(currChar)) {
                charArr[Character.toLowerCase(currChar) - 'a'] = i+1;
            }
        }
        for (int i = 0; i < n; i++) {
            char currChar = word.charAt(i);
            if(Character.isUpperCase(currChar) && charArr[Character.toLowerCase(currChar) - 'a'] < charIdx[Character.toLowerCase(currChar) - 'a'] && charArr[Character.toLowerCase(currChar) - 'a'] != 0) {
                pair++;
                charIdx[Character.toLowerCase(currChar) - 'a'] = -1;
            }
        }
        return pair;
    }
}