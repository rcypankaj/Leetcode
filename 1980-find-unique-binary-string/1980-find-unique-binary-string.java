class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> set = new HashSet<>();

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(nums[i], 2));
        }

        for (int i = 0; i <= n; i++) {
            if (!set.contains(i)) return String.format("%"+nums[0].length()+"s", Integer.toBinaryString(i)).replace(" ", "0");
        }
        return "-1";
    }
}