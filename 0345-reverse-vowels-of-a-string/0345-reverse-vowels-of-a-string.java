class Solution {
    public String reverseVowels(String s) {
        int l = 0, r = s.length()-1;
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        while (l < r) {
            char leftChar = s.charAt(l);
            char rightChar = s.charAt(r);
            if (vowels.contains(leftChar+"") && vowels.contains(rightChar+"")) {
                sb.setCharAt(l, rightChar);
                sb.setCharAt(r, leftChar);
                l++;
                r--;
            } else if (!vowels.contains(leftChar+"") && !vowels.contains(rightChar+"")) {
                l++;
                r--;
            } else if (vowels.contains(leftChar+"")) {
                r--;
            } else {
                l++;
            }
        }
        return sb.toString();
    }
}