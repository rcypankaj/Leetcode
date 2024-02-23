class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int start = left; start <= right; start++) {
            if (isSelfDivisible(start)) list.add(start);
        }
        // System.out.println(isSelfDivisible(10))
        return list;
    }
    public boolean isSelfDivisible(int num) {
        int duplicate = num;
        while (duplicate > 0) {
            int lastDigit = duplicate%10;
            if (lastDigit == 0) return false;
            if (num%lastDigit != 0) return false;
            duplicate /= 10;
        }
        return true;
    }
}