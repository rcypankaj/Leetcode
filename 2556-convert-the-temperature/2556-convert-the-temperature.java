class Solution {
    public double[] convertTemperature(double celsius) {
        double num1 = celsius + 273.15;
        double num2 = celsius * 1.8 + 32;
        return new double[]{num1, num2};
    }
}