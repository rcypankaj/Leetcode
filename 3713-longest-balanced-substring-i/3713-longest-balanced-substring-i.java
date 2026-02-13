class Solution {
    public boolean isValid(String str) {
        int n = str.length();
        if (n <= 1) return true;
        Map<Character, Integer> freq = new HashMap<>();
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < n; i++) {
            char currChar = str.charAt(i);
            freq.put(currChar, freq.getOrDefault(currChar, 0)+1);
            characters.add(currChar);
        }
        int defaultVal = freq.get(str.charAt(0));
        for (Character ch : characters) {
            if (freq.get(ch) != defaultVal) return false;
        }
        return true;
    }
    public int longestBalanced(String s) {
        int n = s.length();

        // Transform char -> int
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
            a[i] = s.charAt(i) - 'a';

        int result = 0;
        for (int l = 0; l < n; l++) {
            // Early exit, can't be bigger
            if (n - l <= result) 
                break;

            int[] cnt = new int[26]; // Counts of every char
            int uniq = 0, maxfreq = 0; // Number of uniq chars and maximum frequency
            for (int r = l; r < n; r++) {
                int i = a[r];

                // There was no this char before => one more uniq
                if (cnt[i] == 0) 
                    uniq++;

                cnt[i]++;
                // Update max frequency
                if (cnt[i] > maxfreq) 
                    maxfreq = cnt[i];

                // Check if all uniq chars have maxfreq frequency then update the result
                int cur = r - l + 1;
                if (uniq * maxfreq == cur && cur > result)
                    result = cur;
            }
        }
        return result;
    }
    // public int longestBalanced(String s) {
    //     int n = s.length();
    //     int maxLen = 0;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i; j < n; j++) {
    //             if (isValid(s.substring(i, j+1))) {
    //                 maxLen = Math.max(maxLen, j-1+1);
    //                 System.out.println(s.substring(i, j+1)+ " J: "+j+"I: "+i+ maxLen);
    //             }
    //         }
    //     }
    //     return maxLen;
    // }
}