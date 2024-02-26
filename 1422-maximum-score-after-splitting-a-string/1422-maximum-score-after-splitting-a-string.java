class Solution {
    public int maxScore(String s) {
        int maxScore = Integer.MIN_VALUE;
        for (int i = 0; i < s.length()-1; i++) {
            int score = countZero(s, i) + countOnes(s, i+1);
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;        
    }
    public int countZero(String s, int idx) {
        int count = 0;
        for (int i = 0; i <= idx; i++) {
            if (s.charAt(i) == '0') count++;
        }
        return count;
    }
    public int countOnes(String s, int idx) {
        int count = 0;
        for (int i = idx; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
        }
        return count;
    }
}