class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int num: nums){
            int temp = num;
            List<Integer> tempList = new ArrayList<>();
            while (temp != 0) {
                int digit = temp%10;
                tempList.add(digit);
                temp /= 10;
            }
            Collections.reverse(tempList);
            for (Integer tempNum: tempList) {
                list.add(tempNum);
            }
        }
        int listSize = list.size();
        int[] res = new int[listSize];
        for (int i = 0; i < listSize; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}