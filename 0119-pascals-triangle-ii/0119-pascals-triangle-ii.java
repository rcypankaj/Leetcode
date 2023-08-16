class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int j = 0; j < rowIndex; j++) {
            int temp = (int)(((long)list.get(j) * (rowIndex-j))/(j+1));
            list.add(temp);
        }
        return list;
    }
}