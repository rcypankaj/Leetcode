class Solution {
    public String processStr(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char currChar = s.charAt(i);

            if (currChar == '*') {
                if (sb.length() > 0)
                    sb.setLength(sb.length()-1);
            } else if (currChar == '#') {
                sb.append(sb);
            } else if (currChar == '%') {
                sb.reverse();
            } else sb.append(currChar);
        }
        return sb.toString();
    }
}