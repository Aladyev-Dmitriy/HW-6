
package ru.netology.qa41.ru.netology.sqr.SQRService;

        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    SQRService sqrService = new SQRService();

    @org.junit.jupiter.api.Test
    void calculateSQR() {
        int expected = 3;
        int actual = sqrService.calculateSQR(200, 300);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNumberOfSquaresExceedingMinimumLimit() {

        int expected = 0;
        int minNumber = 10;
        int maxNumber = 99;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNumberOfSquaresMinimumLimit() {
        SQRService service = new SQRService();

        int expected = 1;
        int minNumber = 100;
        int maxNumber = 100;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateNumberOfSquaresMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 90;
        int minNumber = 100;
        int maxNumber = 9801;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNumberOfSquaresExceedingMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 90;
        int minNumber = 100;
        int maxNumber = 100_000;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }
}