import java.math.BigInteger;
class Solution {
    
    public int numPrimeArrangements(int n) {
        int np = numOfPrimes(n);
        int nnp = n-np;
        BigInteger ansa = fact(np).multiply(fact(nnp));
        ansa = ansa.mod(BigInteger.valueOf(1000000007));
        return ansa.intValue();
    }
    
    private BigInteger fact(int n){
        BigInteger ret = BigInteger.valueOf(1);
        while(n > 1){
            ret = ret.multiply(BigInteger.valueOf(n));
            n--;
        }
        return ret;
    }
    
    private int numOfPrimes(int n){
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int count = 0;
        for(int each : primes){
            if(each > n){
                break;
            }
            count++;
        }
        return count;
    }
    
}