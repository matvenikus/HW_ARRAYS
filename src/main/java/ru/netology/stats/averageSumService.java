package ru.netology.stats;
public class averageSumService {
    public double averageSumNumbers(long[] numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }
}