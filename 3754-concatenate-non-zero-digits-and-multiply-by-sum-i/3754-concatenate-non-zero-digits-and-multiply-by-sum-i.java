class Solution {
    public long sumAndMultiply(int n) {
        int temp = n;
        long sum = 0;
        StringBuilder sb = new StringBuilder();

        while (temp > 0) {
            int lastDigit = temp % 10;

            if (lastDigit != 0) {
                sum += lastDigit;
                sb.append(lastDigit);
            }

            temp /= 10;
        }

        if (sb.length() == 0) {
            return 0;
        }

        sb.reverse();
        long num = Long.parseLong(sb.toString());

        return num * sum;
    }
}