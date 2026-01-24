class Solution {
    public int minSteps(String s, String t) {
        int[] counts = new int[26];
        
        s.chars().forEach(c -> counts[c - 'a']++);

        t.chars().forEach(c -> counts[c - 'a']--);

        return Arrays.stream(counts).map(Math::abs).sum();
    }
}