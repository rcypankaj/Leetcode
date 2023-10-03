class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> indexList2Map = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            String curr = list2[i];
            if (!indexList2Map.containsKey(curr)) {
                indexList2Map.put(curr, i);
            }
        }
        int index = findMinIndex(list1, indexList2Map);
        List<String> list = getResult(list1, indexList2Map, index);
        String[] strArr = list.toArray(new String[list.size()]);
        return strArr;
    }
    public int findMinIndex(String[] list1, HashMap<String, Integer> list2) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            String curr = list1[i];
            if (list2.containsKey(curr)) {
                min = Math.min(min, (i+list2.get(curr)));
            }
        }
        return min;
    }
    public List<String> getResult(String[] list1, HashMap<String, Integer> list2, int index) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            if (list2.containsKey(list1[i]) && (i+ list2.get(list1[i])) == index) {
                list.add(list1[i]);
            }
        }

        return list;
    }
}