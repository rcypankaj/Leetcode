class Solution {
    private int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num%10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num: nums) {
            int sumOfDigits = digitSum(num);
            if (min > sumOfDigits) min = sumOfDigits;
        }
        return min;
    }
}