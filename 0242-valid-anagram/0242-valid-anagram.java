class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (char ch : s.toCharArray()) {
            arr1[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            arr2[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr1[i] < arr2[i] || s.length() != t.length()) {
                return false;
            }
        }
        return true;
    }
}