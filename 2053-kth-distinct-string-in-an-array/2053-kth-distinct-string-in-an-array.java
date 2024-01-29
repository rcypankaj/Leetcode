class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> freqStr = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freqStr.put(arr[i], freqStr.getOrDefault(arr[i], 0)+1);
            // if (!freqStr.contains(arr[i])) {
            //     k--;
            //     if (k == 0) {
            //         return arr[i];
            //     }
            // }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if(freqStr.get(arr[i]) == 1) {
                k--;
                if (k == 0) {
                    return arr[i];
                }
            }
        }
        return "";
    }
}