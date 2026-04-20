class Solution {
    public int reverse(int x) {
        int res = 0;
        int val = Math.abs(x);
        while (val > 0) {
            int rem = val%10;
            val /= 10;
            if (res > Integer.MAX_VALUE/10 || res < Integer.MIN_VALUE/10) 
                return 0;

            res = (res*10)+rem;
        }
        return x < 0 ? -res : res;
    }
}