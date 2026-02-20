class Solution {
    public String makeLargestSpecial(String s) {
        if (s.length() <= 2) return s;

        List<String> parts = new ArrayList<>();
        int count = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                // Recursivelyprocess inner part
                String inner = makeLargestSpecial(s.substring(start + 1, i));
                parts.add("1" + inner + "0");
                start = i + 1;
            }
        }

        // Sort descending to make lexicographically largest
        Collections.sort(parts, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(part);
        }

        return result.toString();
    }
}