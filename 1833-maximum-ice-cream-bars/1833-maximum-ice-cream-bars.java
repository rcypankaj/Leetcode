class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cost = 0, count = 0;
        for (int num: costs) {
            cost += num;
            if (cost > coins) return count;
            count++;
        }
        return count;
    }
}