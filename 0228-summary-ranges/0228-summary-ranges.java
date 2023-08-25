class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        if (nums.length < 1) {
            return result;
        }
        int count = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == count) {
                subList.add(count++);
                if (i == nums.length-1) {
                    list.add(subList);
                }
            } else {
                count = nums[i];
                list.add(subList);
                subList = new ArrayList<>();
                subList.add(count++);
                if (i == nums.length-1) {
                    list.add(subList);
                }
            }
        }
        for (List<Integer> l1 : list) {
            if (l1.size() == 1){
                result.add(Integer.toString(l1.get(0)));
            } else {
                String first = l1.get(0) + "->"+l1.get(l1.size()-1);
                result.add(first);
            }
        }
        return result;
    }
}