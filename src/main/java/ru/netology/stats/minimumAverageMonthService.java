package ru.netology.stats;

public class minimumAverageMonthService {
    public double belowaverage(long[] days) {
        double sum = 0;
        double average = 0;
        int count = 0;

        for (int i = 0; i < days.length; i++) {
            sum = sum + days[i];
        }
        average = sum / days.length;

        for (int i = 0; i < days.length; i++) {
            if (days[i] < average) {
                count++;
            }
        }
        return count;
    }
}