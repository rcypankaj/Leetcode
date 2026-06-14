class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for (String str: words) {
            int sum = 0;
            for (char ch: str.toCharArray()){
                sum += weights[ch-'a'];
            }
            sb.append((char)('z'-sum%26));
            
        }
        return sb.toString();
    }
}