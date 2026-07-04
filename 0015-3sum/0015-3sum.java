class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> set1 = new HashSet<>();
            for (int j = i+1; j < n; j++) {
                int target = -(nums[i]+nums[j]);
                if (set1.contains(target)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add( nums[j]);
                    list.add(target);
                    Collections.sort(list);
                    if (!set.contains(list)) {
                        set.add(list);
                    }
                }
                set1.add(nums[j]);
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        for (List<Integer> list: set) {
            res.add(list);
        }
        return res;
    }
}