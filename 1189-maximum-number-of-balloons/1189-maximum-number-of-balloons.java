class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] charArr = new int[26];
        for (char currChar: text.toCharArray()) {
            charArr[currChar-'a']++;
        }
        int bCount = charArr['b'-'a'];
        int aCount = charArr['a'-'a'];
        int lCount = charArr['l'-'a'];
        int oCount = charArr['o'-'a'];
        int nCount = charArr['n'-'a'];
        int count = 0;
        while (bCount > 0 && aCount > 0 && lCount > 1 && oCount > 1 && nCount > 0) {
            count++;
            bCount--;
            aCount--;
            lCount -= 2;
            oCount -= 2;
            nCount--;
        }
        return count;
    }
}
