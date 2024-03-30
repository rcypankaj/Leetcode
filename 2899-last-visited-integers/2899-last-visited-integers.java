class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int n = nums.length;
        int seen[] = new int[n];
        int pos = n;
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                pos--;
                seen[pos] = nums[i];
                k = 0;
            }else{
                k++;
                if(k <= (n - pos)){
                    ans.add(seen[pos+k-1]);
                }else{
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}