class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet()){
            if (e.getValue() > 1) {
                if (e.getValue()%2 == 0) {
                    count += e.getValue();
                } else {
                    count += e.getValue()-1;
                }
            }
        }

        return count == s.length() ? count : count+1;
    }
}