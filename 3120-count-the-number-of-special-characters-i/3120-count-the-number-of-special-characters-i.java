class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        Map<Character, Integer> map = new HashMap<>();
        int pair = 0;
        for (int i = 0; i < n; i++) {
            char currChar = word.charAt(i);
            if (Character.isLowerCase(currChar)) {
                map.put(currChar, map.getOrDefault(currChar, 0)+1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < n; i++) {
            char currChar = word.charAt(i);
            boolean isUpperCaseChar = Character.isUpperCase(currChar);
            char lowecaseChar = Character.toLowerCase(currChar);
            if (isUpperCaseChar && map.getOrDefault(lowecaseChar, 0) > 0) {
                pair++;
                map.remove(lowecaseChar);
            }
        }
        return pair;
    }
}