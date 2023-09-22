package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class maxSalesServiceTest{
    @Test
    public void testNew(){
        maxSalesService service = new maxSalesService();

        long [] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(days);

        Assertions.assertEquals(expected, actual);
    }
}
