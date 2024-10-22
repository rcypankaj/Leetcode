class Solution {
    public void sortArray(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
    }

    // Convert List<List<Integer>> back to int[][]
    public int[][] convertListToArray(List<List<Integer>> list) {
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i][0] = list.get(i).get(0);
            result[i][1] = list.get(i).get(1);
        }
        return result;
    }

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(intervals[0][0], intervals[0][1])));

        int n = intervals.length;

        for (int i = 1; i < n; i++) {
            // Get the last interval from the list
            List<Integer> prev = list.get(list.size() - 1);

            if (prev.get(1) < intervals[i][0]) {
                // No overlap, add the current interval as a new interval
                list.add(new ArrayList<>(Arrays.asList(intervals[i][0], intervals[i][1])));
            } else {
                // Overlap, merge intervals and replace the last one in the list
                list.set(list.size() - 1, new ArrayList<>(Arrays.asList(prev.get(0), Math.max(prev.get(1), intervals[i][1]))));
            }
        }

        return convertListToArray(list);
    }

    public int[][] mergeUsingOptimalApproach(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
        int n = intervals.length;
        // Loop through all the array
        for (int i = 0; i < n; i++) {
            int first = intervals[i][0];
            int second = intervals[i][1];

            // If list is empty or second is higher than last element of the intervals than continue
            if (!list.isEmpty() && second < list.get(n-1).get(1)) continue;


            for (int j = i+1; j < n; j++) {
                if (intervals[i][0] <= second) {
                    second = Math.max(intervals[j][1], second);
                } else break;
            }
            list.add(Arrays.asList(first, second));
        }

        return convertListToArray(list);
    }
    public int[][] merge(int[][] intervals) {
        sortArray(intervals);
        for (int i = 0; i < intervals.length; i++) {
            System.out.println(intervals[i][0]+" "+intervals[i][1]);
        }
       
        return mergeOverlappingIntervals(intervals);
    }
}