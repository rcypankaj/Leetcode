class Solution {
    private static boolean[] prime = new boolean[32]; 
    // max set bits for 10^6 < 2^20 → at most 20 bits
    
    static {
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
    private boolean isPrime(String str) {
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1') count++;
        }
        return prime[count];
    }
    private String toBinary(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            if ((num&1) == 1) {
                sb.append(1);
            } else sb.append(0);
            num = num >> 1;
        }
        return sb.toString();
    }
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for (int i = left; i <= right; i++) {
            String binaryNum = toBinary(i);
            boolean isPrime = isPrime(binaryNum);
            if (isPrime) {
                res++;
            }
        }
        return res;
    }
}