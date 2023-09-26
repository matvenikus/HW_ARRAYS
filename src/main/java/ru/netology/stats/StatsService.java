package ru.netology.stats;

public class StatsService {
    public double averageNumbers(long[] numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }

    public double overAverage(long[] days) {
        double sum = 0;
        double average = 0;
        int count = 0;

        for (int i = 0; i < days.length; i++) {
            sum = sum + days[i];
        }
        average = sum / days.length;

        for (int i = 0; i < days.length; i++) {
            if (days[i] > average) {
                count++;
            }
        }
        return count;
    }

    public double belowAverage(long[] days) {
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

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int salesSum(long [] sales){
        int sum = 0;
        for (long days : sales){
            sum += days;
        }
        return sum;
    }
}
