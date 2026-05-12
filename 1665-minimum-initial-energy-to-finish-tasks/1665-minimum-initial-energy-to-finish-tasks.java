class Solution {
    public int minimumEffort(int[][] tasks) {

        Arrays.sort(tasks, (a, b) -> {
            return (b[1] - b[0]) - (a[1] - a[0]);
        });

        int currentEnergy = 0;
        int answer = 0;

        for (int[] task : tasks) {
            int actual = task[0];
            int minimum = task[1];

            if (currentEnergy < minimum) {
                answer += (minimum - currentEnergy);
                currentEnergy = minimum;
            }

            currentEnergy -= actual;
        }

        return answer;
    }
}