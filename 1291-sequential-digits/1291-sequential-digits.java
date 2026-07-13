class Solution {
    private int findLen(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public List<Integer> sequentialDigits(int low, int high) {
        int minLen = findLen(low);
        int maxLen = findLen(high);

        List<Integer> res = new ArrayList<>();
        String str = "123456789";

        while (minLen <= maxLen) {

            for (int i = 0; i <= str.length() - minLen; i++) {

                String num = str.substring(i, i + minLen);
                int val = Integer.parseInt(num);

                if (val >= low && val <= high) {
                    res.add(val);
                }
            }

            minLen++;
        }

        return res;
    }
}