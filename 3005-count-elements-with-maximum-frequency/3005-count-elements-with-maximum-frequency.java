class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int max = -1;
        int count = 0;
        for (int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
            max = Math.max(freqMap.getOrDefault(num, 0), max);
        }
        // System.out.println(max);
        // for (Map.Entry<Integer, Integer> e: freqMap.entrySet()) {
        //     if (e.getValue() == max) count++;
        // }
        for (int num: nums) {
            if (freqMap.get(num) == max) count++;
        }
        return count;
    }
}