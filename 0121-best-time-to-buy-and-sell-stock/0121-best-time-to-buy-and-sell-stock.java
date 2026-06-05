class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int maxProfit = 0;
        int max = Integer.MAX_VALUE;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        for (int i = 0; i < n; i++) {
            max = Math.min(prices[i], max);
            prefix[i] = max;
        }
        max = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0; i--) {
            max = Math.max(prices[i], max);
            suffix[i] = max;
        }
        
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(suffix[i]-prefix[i], maxProfit);
        }
        System.out.println(Arrays.toString(prefix)+" "+Arrays.toString(suffix));
        return maxProfit;
    }
}