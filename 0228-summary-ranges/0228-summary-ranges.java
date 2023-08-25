class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length < 1) {
            return result;
        }
        int count = nums[0];
        int first = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == count) {
                count++;
                if (i == nums.length-1) {
                    if (first == count-1) {
                    result.add(Integer.toString(first));
                    } else {
                        result.add(first + "->"+(count-1));
                    }
                }
            } else {
                if (first == count-1) {
                    result.add(Integer.toString(first));
                } else {
                    result.add(first + "->"+(count-1));
                }
                count = nums[i];
                first = count++;
                if (i == nums.length-1) {
                    if (first == count-1) {
                    result.add(Integer.toString(first));
                    } else {
                        result.add(first + "->"+(count-1));
                    }
                }
            }
        }
        for (String num : result) {
            System.out.print(num+" ");
        }
        return result;
    }
}