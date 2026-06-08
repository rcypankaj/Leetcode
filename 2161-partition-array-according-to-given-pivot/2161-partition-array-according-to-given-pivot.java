class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        int[] res = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == pivot) list3.add(nums[i]);
            else if (nums[i] > pivot) list2.add(nums[i]);
            else {
                res[k++] = nums[i];
            }
        }
        int j = 0;
        while (j < list3.size()) {
            res[k++] = list3.get(j++);
        }
        j = 0;
        while (j < list2.size()) {
            res[k++] = list2.get(j++);
        }
        return res;
    }
}