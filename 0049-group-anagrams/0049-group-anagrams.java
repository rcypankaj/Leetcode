class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char[] strArr = strs[i].toCharArray();
            Arrays.sort(strArr);
            String sortedStr = new String(strArr);
            if (map.containsKey(sortedStr)) {
                List<String> list = map.get(sortedStr);
                list.add(strs[i]);
                map.put(sortedStr, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedStr, list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (Map.Entry<String, List<String>> map1: map.entrySet()) {
            res.add(map1.getValue());
        }
        return res;
    }
}