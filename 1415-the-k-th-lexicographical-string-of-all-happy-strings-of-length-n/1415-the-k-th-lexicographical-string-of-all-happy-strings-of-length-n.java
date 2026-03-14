class Solution {
    private final char[] arr = {'a', 'b', 'c'};

    public String getHappyString(int n, int k) {
        int total = 3 << (n - 1);
        if (k > total) return "";
        StringBuilder sb = new StringBuilder();
        int block = 1 << (n - 1);

        int firstCharIdx = (k - 1) / block;
        sb.append(arr[firstCharIdx]);
        k -= firstCharIdx * block;

        char prev = sb.charAt(0);
        
        for (int i = 1; i < n; i++) {
            block /= 2;
            char nextChar = (k <= block) ? getFirstChoice(prev) : getSecondChoice(prev);
            if (k > block) k -= block;
            sb.append(nextChar);
            prev = nextChar;
        }

        return sb.toString();
    }

    
    private char getFirstChoice(char prev) {
        for (char ch : arr) if (ch != prev) return ch;
        return ' ';
    }

    
    private char getSecondChoice(char prev) {
        boolean firstSkipped = false;
        for (char ch : arr) {
            if (ch != prev) {
                if (!firstSkipped) {
                    firstSkipped = true;
                } else {
                    return ch;
                }
            }
        }
        return ' ';
    }
}