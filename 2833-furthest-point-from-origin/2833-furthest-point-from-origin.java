class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0, countR = 0, count_ = 0;
        for (int i = 0; i < moves.length(); i++) {
            char currChar = moves.charAt(i);
            if (currChar == 'R') countR++;
            else if (currChar == 'L') countL++;
            else count_++;
        }
        if (countL >= countR) {
            return countL + count_ - countR;
        }
        return countR+count_ - countL;
    }
}