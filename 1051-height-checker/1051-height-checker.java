class Solution {
    public int heightChecker(int[] heights) {
        int count = 0, max = heights[0];
        int[] expected = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) count++;
        }
        // System.out.println(Arrays.toString(expected));               
        // System.out.println(Arrays.toString(heights));

        // for (int i = 1; i < heights.length; i++) {
        //     if (heights[i] < max) {
        //         count++;
        //     } else {
        //         max = Math.max(heights[i], max);
        //     }
        // }
        return count;
    }
}