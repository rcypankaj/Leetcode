class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            triangle.add(getNthRow(i));
        }
        return triangle;
    }
    private List<Integer> getNthRow(int n) {
        List<Integer> row = new ArrayList<>();
        int val = 1;
        row.add(val);

        for (int k = 1; k <= n; k++) {
            val = val * (n - k + 1) / k;
            row.add(val);
        }
        return row;
    }
}
