class Solution {
    public int findLucky(int[] arr) {
        int res = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int key = e.getValue();
            int val = e.getKey();
            if (key == val) {
                if (res == -1) {
                    res = Math.max(Integer.MIN_VALUE,key);
                } else {
                    res = Math.max(res,key);
                    
                }
                // res = Math.max(key, res == -1 ? Integer.MAX_Value() : res);
            }    
        }
        return res;
    }
}