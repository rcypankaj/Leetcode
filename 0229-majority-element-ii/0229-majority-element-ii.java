class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cnt1 = 0, cnt2 = 0, el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();
        for (int num: nums) {
            if (cnt1 == 0 && el2 != num) {
                cnt1++;
                el1 = num;
            } else if (cnt2 == 0 && el1 != num) {
                cnt2++;
                el2 = num;
            } else if(el1 == num) {
                cnt1++;
            } else if (el2 == num) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        int limitFreq = n/3;
        int count1 = 0, count2 = 0;
        for (int num: nums) {
            if (num == el1) count1++;
            else if (num == el2) count2++;
        }

        if (count1 > limitFreq) res.add(el1);
        if (count2 > limitFreq) res.add(el2);

        return res;
    }
}