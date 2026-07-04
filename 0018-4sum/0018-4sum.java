class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                Set<Long> set1 = new HashSet<>();
                for (int k = j+1; k < n; k++) {
                    long num = (long)nums[i]+nums[j]+nums[k];
                    long fourth = target -(num);
                    if (set1.contains(fourth)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        int num1 = (int)fourth;
                        temp.add(num1);
                        Collections.sort(temp);
                        if (!set.contains(temp)) {
                            set.add(temp);
                        }
                    }
                    set1.add((long)nums[k]);
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        for (List<Integer> list: set) {
            res.add(list);
        }

        return res;
    }
}