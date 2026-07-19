class Solution {

    private String res = "";
    private int totalDistinct = 0;
    private Set<Character> allChars = new HashSet<>();

    private void generate(String str, int idx, StringBuilder sb,
                          Set<Character> chosen) {

        if (sb.length() > totalDistinct)
            return;

        if (sb.length() + (str.length() - idx) < totalDistinct)
            return;

        if (!canComplete(str, idx, chosen))
            return;

        if (idx == str.length()) {

            if (sb.length() == totalDistinct) {
                if (res.isEmpty() || sb.toString().compareTo(res) < 0)
                    res = sb.toString();
            }

            return;
        }

        char ch = str.charAt(idx);

        if (!chosen.contains(ch)) {
            chosen.add(ch);
            sb.append(ch);

            generate(str, idx + 1, sb, chosen);

            sb.deleteCharAt(sb.length() - 1);
            chosen.remove(ch);
        }

        generate(str, idx + 1, sb, chosen);
    }

    private boolean canComplete(String str, int idx, Set<Character> chosen) {

        Set<Character> remaining = new HashSet<>();

        for (int i = idx; i < str.length(); i++) {
            remaining.add(str.charAt(i));
        }

        for (char c : allChars) {
            if (!chosen.contains(c) && !remaining.contains(c))
                return false;
        }

        return true;
    }

    public String smallestSubsequence(String s) {

        int[] last = new int[26];

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (visited[ch - 'a'])
                continue;

            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && last[stack.peek() - 'a'] > i) {

                visited[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char c : stack)
            ans.append(c);

        return ans.toString();
    }
}