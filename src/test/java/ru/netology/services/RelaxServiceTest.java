package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RelaxServiceTest {
    @Test
    public void testCalculateWhenRelaxThreeMonth() {
        RelaxService service = new RelaxService();
        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateWhenRelaxTwoMonth() {
        RelaxService service = new RelaxService();
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

}
