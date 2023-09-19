class Solution {
    public String reverseVowels(String s) {
        int l = 0, r = s.length()-1;
        while (l < r) {
            char leftChar = s.charAt(l);
            char rightChar = s.charAt(r);
            if (isEqualToVowels(leftChar) && isEqualToVowels(rightChar)) {
                s = swap(s, l, r);
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
        return s;
    }
    public boolean isEqualToVowels(char currChar) {
        return currChar == 'a' || currChar == 'e' || currChar == 'i' || currChar == 'o' || currChar == 'u' || currChar == 'A' || currChar == 'E' || currChar == 'I' || currChar == 'O' || currChar == 'U';
    }
    public String swap (String str, int l, int r) {
        return str.substring(0, l)+ str.charAt(r)+ str.substring(l+1, r) + str.charAt(l)+ str.substring(r+1);
    }
}