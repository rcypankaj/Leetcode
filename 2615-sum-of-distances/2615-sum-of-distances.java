class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> freqIdx = new HashMap<>();

        for (int i = 0; i < n; i++) {
            freqIdx.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        long[] res = new long[n];

        for (List<Integer> list : freqIdx.values()) {
            int size = list.size();

            long[] prefix = new long[size];
            prefix[0] = list.get(0);

            for (int i = 1; i < size; i++) {
                prefix[i] = list.get(i) + prefix[i-1];
            }

            for (int i = 0; i < size; i++) {
                int idx = list.get(i);

                long leftSum = i > 0 ? prefix[i-1] : 0;
                long rightSum = prefix[size-1] - prefix[i];

                int leftCount = i;
                int rightCount = size-i-1;

                long leftDist = (long)idx * leftCount - leftSum;
                long rightDist = rightSum - (long)idx * rightCount;
                res[idx] = leftDist+rightDist;
            }
        }
        return res;
    }
}