package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StatsServiceTest {

    @Test
    public void findAverageNumber() {
        StatsService service = new StatsService();

        long[] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        double actual = service.averageNumbers(days);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findHigherThanAverage(){
        StatsService service = new StatsService();

        long [] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        double actual = service.overAverage(days);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findLowerThanAverage(){
        StatsService service = new StatsService();

        long [] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        double actual = service.belowAverage(days);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMostProfitableMonth(){
        StatsService service = new StatsService();

        long [] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSalesMonth(days);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findLeastProfitableMonth(){
        StatsService service = new StatsService();

        long [] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSalesMonth(days);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findProfitSum(){
        StatsService service = new StatsService();

        long [] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.salesSum(days);

        Assertions.assertEquals(expected, actual);
    }
}

