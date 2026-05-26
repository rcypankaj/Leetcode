class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        Set<Character> set = new HashSet<>();
        int pair = 0;
        for (int i = 0; i < n; i++) {
            char currChar = word.charAt(i);
            if (Character.isLowerCase(currChar)) {
                set.add(currChar);
            }
        }
        for (int i = 0; i < n; i++) {
            char currChar = word.charAt(i);
            boolean isUpperCaseChar = Character.isUpperCase(currChar);
            char lowecaseChar = Character.toLowerCase(currChar);
            if (isUpperCaseChar && set.contains(lowecaseChar)) {
                pair++;
                set.remove(lowecaseChar);
            }
        }
        return pair;
    }
}