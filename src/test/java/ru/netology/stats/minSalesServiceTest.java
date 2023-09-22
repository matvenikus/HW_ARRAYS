package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class minSalesServiceTest{
    @Test
    public void testNew(){
        minSalesService service = new minSalesService();

        long [] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(days);

        Assertions.assertEquals(expected, actual);
    }
}
