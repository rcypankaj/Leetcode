class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> freq1 = new HashMap<>();
        for (String str : words1) {
            freq1.put(str, freq1.getOrDefault(str, 0) + 1);
        }
        int count = 0;
        
        Map<String, Integer> freq2 = new HashMap<>();
        for (String str : words2) {
            freq2.put(str, freq2.getOrDefault(str, 0) + 1);
        }
        for (Map.Entry<String, Integer> e : freq1.entrySet()) {
            int freq = e.getValue();
            if (freq == 1 && freq2.getOrDefault(e.getKey(), 0) == 1) {
                count++;
            }
        }
        return count;
        
    }
}