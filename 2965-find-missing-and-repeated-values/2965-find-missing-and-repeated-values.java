class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeat = 0, missing = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!set.contains(grid[i][j])) set.add(grid[i][j]);
                else repeat = grid[i][j];
            }
        }

        for (int i = 1; i <= grid[0].length*grid[0].length; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }
        return new int[]{repeat, missing};
    }
}