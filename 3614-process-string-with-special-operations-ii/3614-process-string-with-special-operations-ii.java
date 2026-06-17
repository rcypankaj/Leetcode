class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long len = 0;
        for (char currChar: s.toCharArray()) {
            if (currChar == '*') {
                if (len > 0) 
                    len -= 1;
            } else if (currChar == '#') {
                len *= 2;
            } else if (currChar == '%') continue;
            else len += 1;
        }

        if (k >= len) return '.';

        for (int i = n-1; i >= 0; i--) {
            char currChar = s.charAt(i);

            if (currChar == '#') {
                long oldLen = len / 2;
                if (oldLen > 0) k %= oldLen;
                len = oldLen;
            } else if (currChar == '*') {
                len++;
            } else if (currChar == '%') {
                k = len-1-k;
            } else  {
                if (k == len - 1) return currChar;
                len--;
            }

        }
        return '.';
        
    }
}