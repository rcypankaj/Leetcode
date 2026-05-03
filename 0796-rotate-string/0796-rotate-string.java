class Solution {
    public boolean rotateString(String s, String goal) {
        int sLen = s.length(), goalLen = goal.length();
        if (sLen != goalLen) return false;
        return (goal+goal).contains(s);
    }
}