class Solution {
    public int minFlips(String s) {
        int n = s.length();
        int altCnt1 = 0, altCnt2 = 0;
        String ss = s+s;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < ss.length(); i++) {
            char currChar = ss.charAt(i);
            char alt1 = (i&1) == 1 ? '1' : '0';
            char alt2 = (i&1) == 1 ? '0' : '1';
            
            if (currChar != alt1) altCnt1++;
            if (currChar != alt2) altCnt2++;

            if (i >= n) {
                char currChar1 = ss.charAt(i-n);
                char altc1 = ((i-n)&1) == 1 ? '1' : '0';
                char altc2 = ((i-n)&1) == 1 ? '0' : '1';
                if (currChar1 != altc1) altCnt1--;
                if (currChar1 != altc2) altCnt2--;
            }

            if (i >= n-1) {
                ans = Math.min(ans, Math.min(altCnt1, altCnt2));
            }
        }
        return ans;
    }
}