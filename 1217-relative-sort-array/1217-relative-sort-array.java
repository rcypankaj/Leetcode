class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num: arr1) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for (int num : arr2) {
            int curr = freq.getOrDefault(num, 0);
            while (curr-- > 0) {
                list.add(num);
            }
            freq.remove(num);
        }
        int[] arrSort = new int[arr1.length - list.size()];
        int j = 0;
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            int curr = e.getValue();
            while (curr-- > 0) {
                arrSort[j++] =  e.getKey();
            }
        }
        Arrays.sort(arrSort);
        for (int num : arrSort) {
            list.add(num);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        System.out.println(freq);

        return arr;


    }
}