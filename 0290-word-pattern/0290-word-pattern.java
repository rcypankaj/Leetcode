class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        if (strArr.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        int i = 0;
        for (char ch : pattern.toCharArray()) {
            if (map.getOrDefault(ch, "") !="") {
                if (!map.get(ch).equals(strArr[i])) return false;
            }
            if (map2.getOrDefault(strArr[i], '0') !='0') {
                if (map2.get(strArr[i]) != ch) return false;
            }
            map.put(ch, strArr[i]);
            map2.put(strArr[i++], ch);
        }
        return true;
    }
}