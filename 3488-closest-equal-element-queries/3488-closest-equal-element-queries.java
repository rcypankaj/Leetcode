class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length, m = queries.length;
        List<Integer> res = new ArrayList<>();

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (int q : queries) {
            int val = nums[q];
            List<Integer> list = map.get(val);

            int size = list.size();
            if (size == 1) {
                res.add(-1);
                continue;
            }

            int pos = Collections.binarySearch(list, q);

            int leftIdx = (pos-1+size)%size;
            int rightIdx = (pos+1)%size;

            int left = list.get(leftIdx);
            int right = list.get(rightIdx);

            int dist1 = Math.abs(left-q);
            dist1 = Math.min(dist1, n-dist1);
            
            int dist2 = Math.abs(right-q);
            dist2 = Math.min(dist2, n-dist2);

            res.add(Math.min(dist1, dist2));
        }

        return res;
    }
}