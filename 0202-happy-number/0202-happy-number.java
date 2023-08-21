class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = sum(slow);
            fast = sum(fast);
            fast = sum(fast);
        } while (slow != fast);
        return slow == 1;
    }
    public int sum (int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num%10;
            sum += (lastDigit * lastDigit);
            num /= 10;
        }
        return sum;
    }
}