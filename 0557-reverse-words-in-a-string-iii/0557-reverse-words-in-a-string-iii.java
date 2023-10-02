class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            StringBuilder sb = new StringBuilder(strArr[i]).reverse();
            strArr[i] = sb.toString();
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i < strArr.length-1) {
            res.append(strArr[i]+" ");

            } else {
            res.append(strArr[i]);

            }
        }
        return res.toString();
        
    }
}