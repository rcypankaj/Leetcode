class Solution {
   public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < words.length; ++i) {
            if (first.equals(words[i - 2]) && second.equals(words[i - 1]))
                sb.append(words[i]+" ");
        }
       System.out.println("a"+sb+"b");
       if (sb.isEmpty()) return new String[]{};
        System.out.println("a"+sb+"b");
       String[] res = sb.toString().split(" ");
        return res;
    }
}