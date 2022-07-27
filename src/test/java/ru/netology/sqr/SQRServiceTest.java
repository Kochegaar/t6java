package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test

    public void test() {
        SQRService service = new SQRService();

        int expected = 11;
        int actual = service.calcsqr(100, 400);

        Assertions.assertEquals(expected, actual);
    }

}



