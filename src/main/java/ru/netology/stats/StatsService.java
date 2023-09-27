package ru.netology.stats;

public class StatsService {

    public double sum(long[] sales) {
        double sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum / sales.length;
    }

    public double averageNumbers(long[] sales) {
        double sum = sum(sales);
            return sum;
    }

    public double belowAverage(long[] sales) {
        double sum = 0;
        double average = 0;
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public double overAverage(long[] sales) {
        double sum = 0;
        double average = 0;
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
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
