class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        for (int i = 0; i < n; i++) {
            int listSize = list.size();
            if (list.isEmpty() || list.get(listSize-1)[1] < intervals[i][0]) {
                list.add(new int[]{intervals[i][0], intervals[i][1]});
            } else {
                list.get(listSize-1)[1] = Math.max(list.get(listSize-1)[1], intervals[i][1]);
            }
        }

        int size = list.size();

        int[][] res = new int[size][2];

        for (int i = 0; i < size; i++) {
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }

        return res;
    }
}