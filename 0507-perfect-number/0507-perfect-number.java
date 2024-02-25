class Solution {
    public boolean checkPerfectNumber(int num) {
        int res = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i == 0) {
                res += i;
                if (num/i != i && num%(num/i) == 0) res += (num/i);
            }
        }
        
        return res == num && num != 1;
    }
}