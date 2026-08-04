class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int num: nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            
            set.add(num);
        }

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}