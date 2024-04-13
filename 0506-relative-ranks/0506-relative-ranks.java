public class Solution {
    public String[] findRelativeRanks(int[] score) {
        //store the indexes in the hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        int len= score.length;
        for(int i =0;i<len;i++)
        {
            map.put(score[i],i);
        }

        //create a max heap priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int num : score) {
            pq.add(num);
        }

        String[] arr = new String[len];
        // with a for loop get the indexs and place the String values
        // in the String array
        for(int i =0,j=1;i<len;i++,j++)
        {
            if(j ==1)
            {
                arr[map.get(pq.poll())] = "Gold Medal";
                continue;
            }
            if(j ==2)
            {
                arr[map.get(pq.poll())] = "Silver Medal";
                continue;
            }
            if(j ==3)
            {
                arr[map.get(pq.poll())] = "Bronze Medal";
                continue;
            }
            arr[map.get(pq.poll())] = String.valueOf(j);
            
        }

        return arr;
    
    }
}