class Solution {
    public boolean canSplit(String str, int idx, int target) {
        int n = str.length();
        if (idx == n) {
            return target == 0;
        }

        int num = 0;
        for (int j = idx; j < n; j++) {
            int currNum = str.charAt(j) - '0';
            num = num*10+currNum;
            if (num > target) return false;
            if (canSplit(str, j+1, target-num)) {
                return true;
            }
        }
        return false;
    }
    public int punishmentNumber(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (canSplit(Integer.toString(i*i), 0, i)) {
                ans += (i*i);
            }
        }
        return ans;
    }
}