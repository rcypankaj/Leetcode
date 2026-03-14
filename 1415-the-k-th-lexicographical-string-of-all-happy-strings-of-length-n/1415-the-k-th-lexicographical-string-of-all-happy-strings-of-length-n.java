class Solution {
    private String ans = "";
    private final char[] arr = new char[]{'a', 'b', 'c'};
    public void findStr(String curr, int n, int[] k) {
        if (!ans.isEmpty()) return;

        if (curr.length() == n) {
            k[0]--;
            if (k[0] == 0) ans = curr;
            return;
        }

        for (char ch : arr) {
            if (curr.isEmpty() || curr.charAt(curr.length()-1) != ch) {
                findStr(curr+ch, n, k);
            }
        }
    }
    public String getHappyString(int n, int k) {
        ans = "";
        findStr("", n, new int[]{k});
        return ans;
    }
}