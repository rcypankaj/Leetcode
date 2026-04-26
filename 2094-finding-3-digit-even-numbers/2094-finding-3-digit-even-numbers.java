class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        
        for (int d : digits) {
            freq[d]++;
        }
        
        List<Integer> result = new ArrayList<>();
        
        for (int num = 100; num <= 999; num++) {
            if (num % 2 != 0) continue;
            
            int[] temp = new int[10];
            int x = num;
            
            int d1 = x % 10; x /= 10;
            int d2 = x % 10; x /= 10;
            int d3 = x % 10;
            
            temp[d1]++;
            temp[d2]++;
            temp[d3]++;
            
            boolean valid = true;
            for (int i = 0; i < 10; i++) {
                if (temp[i] > freq[i]) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) result.add(num);
        }
        
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        
        return ans;
    }
}