class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev2 = cost[0];
        int prev1 = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int prev = Math.min(prev1, prev2) + cost[i];
            prev2 = prev1;
            prev1 = prev;
        }
        return Math.min(prev2, prev1);
    }
}