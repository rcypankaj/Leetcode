class Solution {
    public int findMaxK(int[] nums) {
        int res = -1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
         for (int num : nums) {
            if (num > 0 && set.contains(-num)) {
                res = Math.max(res, num);
                System.out.println(res+" "+ num);
            }
               if (num < 0 && set.contains(Math.abs(num)) ){
                res = Math.max(res, num);
                System.out.println(res+" "+ num);
            }
        }
        return res;
        
    }
}