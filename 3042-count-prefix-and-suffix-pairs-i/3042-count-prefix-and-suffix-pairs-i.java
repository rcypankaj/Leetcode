class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            String s1=words[i];
            for(int j=i+1;j<words.length;j++){
                String s2=words[j];
                if(s2.length()>s1.length()){
                int k=s2.length()-s1.length();
                if(s1.equals(s2.substring(0,s1.length())) && s1.equals(s2.substring(k)))
                    c++;
                }
                if(s2.length()==s1.length()){
                    if(s1.equals(s2))
                        c++;
                }
            }
        }
        return c;
    }
}