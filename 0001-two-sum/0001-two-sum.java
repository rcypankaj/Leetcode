class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currVal = nums[i];
            if(map.containsKey(target - currVal)) {
                arr[0] = i;
                arr[1] = map.get(target - currVal);
                return arr;
            } else {
                map.put(currVal, i);
            }
        }
        return arr;
    }
}