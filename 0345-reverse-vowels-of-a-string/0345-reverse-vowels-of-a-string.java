class Solution {
    public String reverseVowels(String s) {
        int l = 0, r = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while (l < r) {
            char leftChar = s.charAt(l);
            char rightChar = s.charAt(r);
            if (isEqualToVowels(leftChar) && isEqualToVowels(rightChar)) {
                sb.setCharAt(l, rightChar);
                sb.setCharAt(r, leftChar);
                l++;
                r--;
            } else if (!isEqualToVowels(leftChar) && !isEqualToVowels(rightChar)) {
                l++;
                r--;
            } else if (isEqualToVowels(leftChar)) {
                r--;
            } else {
                l++;
            }
        }
        return sb.toString();
    }
    public boolean isEqualToVowels(char currChar) {
        char currCharLower = Character.toLowerCase(currChar);
        return currCharLower == 'a' || currCharLower == 'e' || currCharLower == 'i' || currCharLower == 'o' || currCharLower == 'u';
    }
}