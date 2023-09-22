package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class salesSumServiceTest{
    @Test
    public void testNew1(){
        salesSumService service = new salesSumService();

        long [] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.salesSum(days);

        Assertions.assertEquals(expected, actual);
    }
}
