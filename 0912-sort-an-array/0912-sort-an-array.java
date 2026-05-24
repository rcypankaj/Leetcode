class Solution {
    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
    }
    private static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < n-i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }
    private static void  insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    private static void conquer(int[] arr, int si, int mid, int ei) {
        int [] temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    private static void divide(int[] arr, int si, int ei) {
        if (si >= ei) return;
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    private static void mergeSort(int[] arr) {
        int n = arr.length;
        divide(arr, 0, n-1);
    }
    private static void recursiveBubbleSort(int[] arr, int n) {
        if (n == 0) return;
        boolean isSwapped = false;
        for (int i = 1; i <= n; i++) {
            if (arr[i-1] > arr[i]) {
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
                isSwapped = true;
            }
        }
        if (!isSwapped) return;
        recursiveBubbleSort(arr, n-1);
    }
    private static void recursiveInsertionSort(int[] arr, int n) {
        if (n == 0) return;
        recursiveInsertionSort(arr, n-1);

        int key = arr[n];
        int j = n-1;
        while (j >= 0 && arr[j] > key) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;

    }
    public int[] sortArray(int[] nums) {
        recursiveInsertionSort(nums, nums.length-1);
        return nums;
    }
}