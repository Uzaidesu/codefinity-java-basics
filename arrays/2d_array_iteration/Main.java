package com.example;

public class Main {
    public static double[] calculateDailyAverages(int[][] temperatures) {
        int days = temperatures[0].length;
        int stations = temperatures.length;
        double[] dailyAverages = new double[days];

        for (int i = 0; i < temperatures[0].length; i++) {
            int totalTemp = 0;
            for (int j = 0; j < temperatures.length; j++) {
                totalTemp += temperatures[j][i];
            }
            dailyAverages[i] = (double) totalTemp / stations;
        }

        return dailyAverages;
    }

    public static void main(String[] args) {
        int[][] temperatures = {
                {20, 22, 24, 19, 21, 23, 25},
                {18, 20, 22, 19, 20, 22, 24},
                {21, 23, 25, 22, 24, 26, 28},
                {19, 21, 23, 20, 22, 24, 26}
        };

        double[] averages = calculateDailyAverages(temperatures);
        for (int day = 0; day < averages.length; day++) {
            System.out.println("Average temperature on day " + (day + 1) + ": " + averages[day]);
        }
    }
}
