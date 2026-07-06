class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        for (int[] interval: intervals) {
            if (list.isEmpty() || list.get(list.size()-1)[1] < interval[0]) {
                list.add(new int[]{interval[0], interval[1]});
            } else {
                int[] last = list.get(list.size()-1);
                last[1] = Math.max(last[1], interval[1]);
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