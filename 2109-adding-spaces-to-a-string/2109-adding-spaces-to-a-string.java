class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = spaces.length;
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int strIdx = spaces[i];
            String pre = s.substring(idx, strIdx);
            sb.append(pre);
            sb.append(" ");
            idx = strIdx;
        }
        sb.append(s.substring(idx));
        return sb.toString();
    }
}