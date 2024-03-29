class Solution {
    public int maxScore(String s) {
        int maxScore = Integer.MIN_VALUE;
        int countZero = 0, countOnes = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') countOnes++;
        }
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == '0') countZero++;
            else if(s.charAt(i) == '1') countOnes--;
            int score = countZero + countOnes;
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;        
    }
}