class Solution {
    private static boolean[] prime = new boolean[32]; 
    
    static {
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        int n = prime.length;
        
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for (int i = left; i <= right; i++) {
            int binaryNum = Integer.bitCount(i);
            if (prime[binaryNum]) {
                res++;
            }
        }
        return res;
    }
}