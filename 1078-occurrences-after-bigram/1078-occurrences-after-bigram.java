class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> str = new ArrayList<>();
        String[] strArr = text.split(" ");
        for (int i = 0; i < strArr.length - 1; i++) {
            if (strArr[i].equals(first) && strArr[i+1].equals(second)) {
                if (i+2 <= strArr.length-1) str.add(strArr[i+2]);
            }
        }
        String[] res = new String[str.size()];
        for (int i = 0; i < str.size(); i++) {
            res[i] = str.get(i);
        }
        return res;
    }
}