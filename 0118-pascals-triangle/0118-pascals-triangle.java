class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        res.add(temp);

        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                List<Integer> prevList = res.get(i-1);
                int size = prevList.size();
                int firstVal = j-1 >= 0 ? prevList.get(j-1) : 0;
                int secVal = j < size ? prevList.get(j) : 0;

                list.add(firstVal+secVal);

            }
            res.add(list);
        }
        return res;
    }
}