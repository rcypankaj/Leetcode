class Solution {
    // Brute force
    private List<List<Integer>> findFourSum1(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n-3; i++) {
            for (int j = i+1; j < n-2; j++) {
                for (int k = j+1; k < n-1; k++) {
                    for (int l = k+1; l < n; l++) {
                        long sum = nums[i] + nums[j];
                        sum += nums[k];
                        sum += nums[l];
                        if (sum == target) {
                            List<Integer> ans = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(ans);
                            set.add(ans);
                        }
                    }
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>(set);
        return res;
    }

    // Better Approach
    private List<List<Integer>> findFourSum2(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < n-3; i++) {
            for (int j = i+1; j < n-2; j++) {
                Set<Long> fourth = new HashSet<>();
                for (int k = j+1; k < n; k++) {
                    long sum = nums[i]+nums[j];
                    sum += nums[k];
                    if (fourth.contains(target - sum)) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], (int)(target-sum), nums[k]);
                        Collections.sort(temp);
                        ans.add(temp);
                    } 
                    fourth.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>(ans);
        return res;
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // return findFourSum1(nums, target);
        return findFourSum2(nums, target);
    }
}