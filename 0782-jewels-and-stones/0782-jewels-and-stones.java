class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char ch : stones.toCharArray()) {
            if (jewels.contains(ch+"")) count++;
        }
        return count;
    }
}