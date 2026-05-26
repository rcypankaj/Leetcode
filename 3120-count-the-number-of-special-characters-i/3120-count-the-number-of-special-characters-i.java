class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int[] charArr = new int[26];
        int pair = 0;
        for (int i = 0; i < n; i++) {
            char currChar = word.charAt(i);
            if (Character.isLowerCase(currChar)) {
                charArr[currChar-'a']++;
            }
        }
        for (int i = 0; i < n; i++) {
            char currChar = word.charAt(i);
            boolean isUpperCaseChar = Character.isUpperCase(currChar);
            char lowecaseChar = Character.toLowerCase(currChar);
            if (isUpperCaseChar && charArr[lowecaseChar-'a'] > 0) {
                pair++;
                charArr[lowecaseChar-'a'] = 0;
            }
        }
        return pair;
    }
}