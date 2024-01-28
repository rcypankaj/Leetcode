class Solution {
    public String reversePrefix(String word, char ch) {
        int it = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                it = i;
                break;
            }
        }
        int start = 0;
        
        if (it != -1)
        while (start < it) {
            char startChar = word.charAt(start);
            char endChar = word.charAt(it);
            word = word.substring(0, start) + endChar + word.substring(start+1);
            // word = word.substring(0, start) + endChar + word.substring(start, it) + word.substring(it+1);
            System.out.println(word);
            word = word.substring(0, it) + startChar + word.substring(it+1);
            // System.out.println(word);
            start++;
            it--;
            
            
        } 
        return word;
        
    }
}