class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (i * i < num) {
            if (i == 46341) {
                break;
            }
            i++;
        }
        return i * i == num;
       
    }
}