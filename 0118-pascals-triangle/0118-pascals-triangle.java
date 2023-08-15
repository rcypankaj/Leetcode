class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List <Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    rows.add(1);
                } else {
                    rows.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
                }
            }

            res.add(rows);
        }

        return res;
        
    }
}