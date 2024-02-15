class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int si = 0, ei = s.length()-1;
        while (si < ei) {
            char siChar = s.charAt(si);
            char eiChar = s.charAt(ei);
            if (Character.isLetter(siChar) && Character.isLetter(eiChar)) {
                sb.setCharAt(si, eiChar);
                sb.setCharAt(ei, siChar);
                si++;
                ei--;
            } else if (Character.isLetter(siChar)) {
                ei--;
            } else if (Character.isLetter(eiChar)) {
                si++;
            } else {
                si++;
                ei--;
            }
        }
        return sb.toString();
    }
}