class Solution {
    public int countCharacters(String[] words, String chars) {
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            if (isFormed(words[i], chars)) {
                res += words[i].length();
            }
        }
        return res;
    }    
    public boolean isFormed(String words, String chars) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            char curr = chars.charAt(i);
            freqMap.put(curr, freqMap.getOrDefault(curr, 0)+1);
        }
        
        for (int i = 0; i < words.length(); i++) {
            if (freqMap.containsKey(words.charAt(i))) {
                freqMap.put(words.charAt(i), freqMap.get(words.charAt(i))-1);
                if (freqMap.get(words.charAt(i)) < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;        
    }
}