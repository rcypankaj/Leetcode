class Solution {
    public int countPrimes(int n) {
        int inputLen = 5000000;
        boolean[] isPrime = new boolean[inputLen];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 0; i < Math.sqrt(inputLen); i++) {
            if (isPrime[i])
                for (int j = i+i; j <inputLen; j += i) {
                    isPrime[j] = false;
                }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
}