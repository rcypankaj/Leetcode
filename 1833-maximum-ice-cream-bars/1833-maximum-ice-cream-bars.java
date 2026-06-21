class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;
        for (int cost: costs) {
            maxCost = Math.max(maxCost, cost);
        }

        int[] arr = new int[maxCost+1];
        for (int cost: costs) {
            arr[cost]++;
        }
        int count = 0, costSpent = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                if (arr[i] > 0)
                    costSpent += i;
                if (costSpent > coins) return count;
                if (arr[i] > 0) count++;
                arr[i]--;
            }
        }
        return count;
    }
}