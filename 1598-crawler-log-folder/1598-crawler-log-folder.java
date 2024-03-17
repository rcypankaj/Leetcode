class Solution {
    public int minOperations(String[] logs) {
        int res = 0;
        for (String str : logs) {
            if (str.contains("../") && res > 0) {
                res -= 1;
            } else if (str.contains("./")) {
                continue;
            } else {
                res += 1;
            }
        }
        return res <= 0 ? 0 : res;
    }
}