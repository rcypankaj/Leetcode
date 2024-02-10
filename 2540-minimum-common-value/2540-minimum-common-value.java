class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int res = -1;
        HashSet set1 = new HashSet<Integer>();
        HashSet set2 = new HashSet<Integer>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        // int min = Integer.MAX_VALUE;
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()) {
            int el = iterator.next();
            if (set2.contains(el)) {
                if (res == -1) res = el;
                else {
                    res = Math.min(res, el);
                }
               
            }
            
        }
        return res;
    }
}