class Solution {

    public boolean canFinish(long time, int[] workerTimes, int height) {

        long total = 0;

        for (int w : workerTimes) {

            long val = (long)(Math.sqrt(1 + (8.0 * time) / w) - 1) / 2;

            total += val;

            if (total >= height)
                return true;
        }

        return false;
    }

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long left = 0;
        long right = (long)1e18;

        long ans = right;

        while (left <= right) {

            long mid = left + (right - left) / 2;

            if (canFinish(mid, workerTimes, mountainHeight)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}