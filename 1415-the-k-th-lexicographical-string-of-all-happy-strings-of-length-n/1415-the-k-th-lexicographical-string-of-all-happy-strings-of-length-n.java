class Solution {
    private final char[] arr = {'a', 'b', 'c'};
    public String findStr(String curr, int n, int[] k) {
        if (curr.length() == n) {
            k[0]--;
            if (k[0] == 0) return curr;
            return "";
        }

        for (char ch : arr) {
            if (curr.isEmpty() || curr.charAt(curr.length()-1) != ch) {
                String ans = findStr(curr+ch, n, k);
                if (!ans.isEmpty()) return ans;
            }
        }
        return "";
    }
    public String getHappyString(int n, int k) {
        int block = 1 << (n-1);
        if (block*3 < k) return "";
        int startIdx = (k-1)/block;
        int newK = k- (startIdx*block);
        return findStr(arr[startIdx]+"", n, new int[]{newK});
    }
}