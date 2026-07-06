class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        list.add(new int[]{intervals[0][0], intervals[0][1]});
        for (int i = 1; i < n; i++) {
            int start  = intervals[i][0];
            int end  = intervals[i][1];
            int listSize = list.size();
            int prevEnd = list.get(listSize-1)[1];

            if (prevEnd >= start) {
                list.get(listSize-1)[1] = Math.max(prevEnd, end);
            } else {
                list.add(new int[]{start, end});
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