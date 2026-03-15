class Fancy {
    List<Long> list;
    long MOD = 1000000007;
    long add = 0;
    long mult = 1;
    public Fancy() {
        list = new ArrayList<>();
    }
    
    public void append(int val) {
        long stored = ((val - add + MOD) % MOD) * modInverse(mult) % MOD;
        list.add(stored);
    }
    
    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }
    
    public void multAll(int m) {
        add = (add * m)% MOD;
        mult = (mult * m) % MOD;
    }
    
    public int getIndex(int idx) {
        if (list.size() <= idx) return -1;
        return (int)((list.get(idx)*mult+add)%MOD);
    }
    private long modInverse(long x) {
        return pow(x, MOD-2);
    }
    private long pow(long x, long y) {
        long res = 1;
        x %= MOD;

        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % MOD;

            x = (x * x) % MOD;
            y >>= 1;
        }
        return res;
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */