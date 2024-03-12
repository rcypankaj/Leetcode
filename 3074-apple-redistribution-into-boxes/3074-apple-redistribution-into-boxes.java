class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sumApple = 0;
        for (int num : apple) {
            sumApple += num;
        }
        int res = 0, sum = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            if (sum+capacity[i] < sumApple) {
                res++;
                sum += capacity[i];
            } else {
                res++;
                break;
            }
        }
        return res;
    }
}