class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if (n == 0) {
            return true;
        } 
        char currChar = s.charAt(0);
        if (n == 1) {
            return false;
        } else if (currChar == ')' || currChar == '}' || currChar == ']') {
            return false;
        }

        char closingChar = findClosing(currChar);
        int idx, count = 0;
        for (idx = 1; idx < n; idx++) {
            if (s.charAt(idx) == currChar) {
                count++;
            } else if(s.charAt(idx) == closingChar) {
                if (count == 0) {
                    break;
                }
                count--;
            } 
        }
        if (n == idx) {
            return false;
        }

        if (idx == 1) {
            return isValid(s.substring(2));
        }
        return isValid(s.substring(1, idx)) && isValid(s.substring(idx + 1));
    }
    private char findClosing(char ch) {
        if (ch == '(') return ')';
        else if (ch == '{') return '}';
        else if (ch == '[') return ']';
        else return Character.MIN_VALUE;
    }
}