package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class minimumAverageMonthServiceTest {
    @Test
    public void testNew(){
        minimumAverageMonthService service = new minimumAverageMonthService();

        long [] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        double actual = service.belowaverage(days);

        Assertions.assertEquals(expected, actual);
    }
}
