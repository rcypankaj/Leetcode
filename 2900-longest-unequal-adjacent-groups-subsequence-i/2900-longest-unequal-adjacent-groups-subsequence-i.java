class Solution {
     public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        for(int i =0; i< words.length; i++) {
            if (i == 0) {
                result.add(words[i]);
            } else if (groups[i] != groups[i-1]){
                result.add(words[i]);
            }
        }
        return result;
    }
}