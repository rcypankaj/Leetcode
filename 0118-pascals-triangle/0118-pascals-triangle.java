class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if (i == 0) {
                list.add(1);
            } else {
                List<Integer> prevList = res.get(i-1);
                for (int j = 0; j < i+1; j++) {
                    if (j-1 < 0) {
                        list.add(1);
                    } else {
                        System.out.println(prevList.toString());
                        int firstNum = j-1 < 0 ? 0 : prevList.get(j-1);
                        int secondNum = j < prevList.size() ? prevList.get(j) : 0;
                        list.add(secondNum+firstNum);
                    }
                }
            }
            res.add(list);
        }
        return res;
    }
}