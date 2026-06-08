class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        int[] res = new int[n];

        for (int num: nums) {
            if (num == pivot) list3.add(num);
            else if (num > pivot) list2.add(num);
            else list1.add(num);
        }
        int i = 0;
        while (i < list1.size()) {
            res[i] = list1.get(i++);
        }
        int j= 0;
        while (j < list3.size()) {
            res[i++] = list3.get(j++);
        }
        j = 0;
        while (j < list2.size()) {
            res[i++] = list2.get(j++);
        }
        return res;
    }
}