class Solution {
      private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > (long)2 * (long)arr[right]) right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += countPairs(arr, low, mid, high); //Modification
        merge(arr, low, mid, high);  // merging sorted halves
        return cnt;
    }

    public static int team(int[] skill, int n) {
        return mergeSort(skill, 0, n - 1);
    }
    // private int countPairs(int[] nums, int si, int mid, int ei) {
    //     int count = 0;
    //     int right = mid +1;
    //     for (int i = si; i <= mid; i++) {
    //         while (right <= ei && nums[i] > nums[right]*2) {
    //             right++;
    //         }
    //         count += (right-(mid+1));
    //     }
    //     return count;
    // }
    private void conquer(int[] nums, int si, int mid, int ei) {
        int[] merger = new int[(ei-si)+1];
        int idx1 = si;
        int idx2 = mid+1;
        int count = 0;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (nums[idx1] <= nums[idx2]) {
                merger[x++] = nums[idx1++];
            } else {
                merger[x++] = nums[idx2++];
            }
        }

        while (idx1 <= mid) {
            merger[x++] = nums[idx1++];
        }
        while (idx2 <= ei) {
            merger[x++] = nums[idx2++];
        }

        for (int i = 0, j = si; i < merger.length; i++, j++) {
            nums[j] = merger[i];
        }
    }
    // Using Brute Force
    private int findReversePairs1(int[] nums, int si, int ei) {
        int count = 0;
        if (si >= ei) return count;

        int mid = si + (ei -si)/2;
        
        count += findReversePairs1(nums, si, mid);
        count += findReversePairs1(nums, mid+1, ei);
        count += countPairs(nums, si, mid, ei);
        conquer(nums, si, mid, ei);
        return count;
    }
    public int reversePairs(int[] nums) {
        // int cou =  findReversePairs1(nums, 0, nums.length-1);
        // System.out.println(Arrays.toString(nums));
        return team(nums, nums.length);
    }
}