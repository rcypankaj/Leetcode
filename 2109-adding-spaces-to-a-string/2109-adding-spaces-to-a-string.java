class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = s.length();
        String res = "";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (idx >= spaces.length) {
                sb.append(s.substring(i));
                break;
            }
            if (i == spaces[idx]) {
                idx++;
                sb.append(" ");
                sb.append(s.charAt(i));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}