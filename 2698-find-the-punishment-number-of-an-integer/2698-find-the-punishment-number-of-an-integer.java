class Solution {
    Boolean memo[][];
    public boolean canSplit(String str, int idx, int target) {
        int n = str.length();
        if (idx == n) {
            return target == 0;
        }

        if (memo[idx][target] != null) return memo[idx][target];

        int num = 0;
        for (int j = idx; j < n; j++) {
            int currNum = str.charAt(j) - '0';
            num = num*10+currNum;
            if (num > target) break;
            if (canSplit(str, j+1, target-num)) {
                memo[idx][target] = true;
                return true;
            }
        }
        return memo[idx][target] = false;
    }
    public int punishmentNumber(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            String sq = Integer.toString(i*i);
            memo = new Boolean[sq.length()][i+1];
            if (canSplit(sq, 0, i)) {
                ans += (i*i);
            }
        }
        return ans;
    }
}