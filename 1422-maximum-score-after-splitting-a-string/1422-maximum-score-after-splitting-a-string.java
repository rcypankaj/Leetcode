class Solution {
    public int maxScore(String s) {
        int maxScore = Integer.MIN_VALUE;
        int countZero = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == '0') countZero++;
            int score = countZero + countOnes(s, i+1);
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;        
    }
    public int countOnes(String s, int idx) {
        int count = 0;
        for (int i = idx; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
        }
        return count;
    }
}