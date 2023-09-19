class Solution {
    public String reverseVowels(String s) {
        int l = 0, r = s.length()-1;
        String vowels = "aeiouAEIOU";
        while (l < r) {
            char leftChar = s.charAt(l);
            char rightChar = s.charAt(r);
            if (vowels.contains(leftChar+"") && vowels.contains(rightChar+"")) {
                s = swap(s, l, r);
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
        return s;
    }
    public String swap (String str, int l, int r) {
        return str.substring(0, l)+ str.charAt(r)+ str.substring(l+1, r) + str.charAt(l)+ str.substring(r+1);
    }
}