class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // char freq = s.charAt(i);
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)+1);
        }

        for (char ch: t.toCharArray()) {
            if (freq.getOrDefault(ch, 0) < 1){ 
                System.out.println(ch);
                return ch;
            } else {
                freq.put(ch, freq.get(ch)-1);
            }
        }
        return '0';
    }
}