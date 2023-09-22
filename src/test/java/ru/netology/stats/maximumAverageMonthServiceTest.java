package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class maximumAverageMonthServiceTest {
    @Test
    public void testNew(){
        maximumAverageMonthService service = new maximumAverageMonthService();

        long [] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        double actual = service.overaverage(days);

        Assertions.assertEquals(expected, actual);
    }
}

