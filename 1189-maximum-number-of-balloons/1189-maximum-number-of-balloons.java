class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char currChar: text.toCharArray()) {
            freqMap.put(currChar, freqMap.getOrDefault(currChar, 0)+1);
        }
        int bCount = freqMap.getOrDefault('b', 0);
        int aCount = freqMap.getOrDefault('a', 0);
        int lCount = freqMap.getOrDefault('l', 0);
        int oCount = freqMap.getOrDefault('o', 0);
        int nCount = freqMap.getOrDefault('n', 0);
        int count = 0;
        while (bCount > 0 && aCount > 0 && lCount > 1 && oCount > 1 && nCount > 0) {
            count++;
            bCount--;
            aCount--;
            lCount -= 2;
            oCount -= 2;
            nCount--;
        }
        return count;
    }
}
