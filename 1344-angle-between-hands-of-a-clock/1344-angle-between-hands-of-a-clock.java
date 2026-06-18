class Solution {
    public double angleClock(int hour, int minutes) {
        int minutesHand = minutes*6;
        double hourHand = ((hour%12)*30)+(double)(minutes*0.5);
        System.out.println(minutesHand+" "+hourHand);
        double diff = Math.abs(minutesHand - hourHand);
        return Math.min(diff, 360-diff);
    }
}