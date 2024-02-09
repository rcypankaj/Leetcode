class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length-1; i >= 0; i--) {
            int temp = max;
            max = Math.max(arr[i], max);
            arr[i] = temp;
         
        }
        return arr;
    }
}