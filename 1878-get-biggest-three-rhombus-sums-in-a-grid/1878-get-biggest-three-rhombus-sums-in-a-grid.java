class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Set<Integer> set = new HashSet<>();

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {

                set.add(grid[r][c]);

                int k = 1;

                while (true) {

                    if (r - k < 0 || r + k >= m || c - k < 0 || c + k >= n)
                        break;

                    int sum = 0;

                    for (int i = 0; i < k; i++)
                        sum += grid[r - k + i][c + i];

                    for (int i = 0; i < k; i++)
                        sum += grid[r + i][c + k - i];

                    for (int i = 0; i < k; i++)
                        sum += grid[r + k - i][c - i];

                    for (int i = 0; i < k; i++)
                        sum += grid[r - i][c - k + i];

                    set.add(sum);

                    k++;
                }
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        int size = Math.min(3, list.size());
        int[] ans = new int[size];

        for (int i = 0; i < size; i++)
            ans[i] = list.get(i);

        return ans;
    }
}