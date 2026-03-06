class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        boolean isCheckedSegmant = false;
        int i = 0;
        while (i < n) {
            char currChar = s.charAt(i);
            if (currChar == '1') {
                if (isCheckedSegmant) return false;
                while (i < n) {
                    if (s.charAt(i) == '1') i++;
                    else break;
                }
                isCheckedSegmant = true;
            }
            i++;
        }
        return isCheckedSegmant;
    }
}