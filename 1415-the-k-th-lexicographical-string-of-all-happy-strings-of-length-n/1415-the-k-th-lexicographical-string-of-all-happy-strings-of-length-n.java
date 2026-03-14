class Solution {
    static String ans = "";
    char[] arr = new char[]{'a', 'b', 'c'};
    public void findStr(String curr, int n, int[] k) {
        if (!ans.isEmpty()) return;

        if (curr.length() == n) {
            k[0]--;
            if (k[0] == 0) ans = curr;
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (curr.isEmpty() || curr.charAt(curr.length()-1) != arr[i]) {
                findStr(curr+arr[i], n, k);
            }
        }
    }
    public String getHappyString(int n, int k) {
        ans = "";
        findStr("", n, new int[]{k});
        return ans;
    }
}