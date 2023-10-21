class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            res[i] = countOnes(i);
        }
        return res;
    }
    public int countOnes(int num) {
         int cnt = 0;
        while(num > 0){
            cnt++;
            num &= (num-1);
        }
        return cnt;
    }
}