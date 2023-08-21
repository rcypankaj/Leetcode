class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            n = sum(n);
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            System.out.println(n);
        }
        return true;
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