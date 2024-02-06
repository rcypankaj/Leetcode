class Solution {
    public int countDigits(int num) {
        int val = num;
        int count = 0;
        while (val > 0) {
            int lastDigit = val%10;
            if (num%lastDigit == 0) {
                count++;
            }
            val /= 10;
        }
        return count;
    }
}