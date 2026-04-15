class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        if (words[startIndex].equals(target)) return 0;
        int n = words.length;
        int res = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int diff = Math.abs(i-startIndex);
                int minDiff = Math.min(diff, n-diff);
                res = Math.min(res, minDiff);
            }
        }
        return res == Integer.MAX_VALUE ? -1: res;
    }
}