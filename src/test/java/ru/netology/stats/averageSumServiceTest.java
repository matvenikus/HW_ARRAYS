package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class averageSumServiceTest{
    @Test
    public void testNew(){
        averageSumService service = new averageSumService();

        long [] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        double actual = service.averageSumNumbers(days);

        Assertions.assertEquals(expected, actual);
    }
}
