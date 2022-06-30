package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/border.csv")
    public void calcMethodSortingNumbers(int expected, int firstBorder, int secondBorder) {
        SQRService service = new SQRService();
        int actual = service.MethodSortingNumbers(firstBorder, secondBorder);
        Assertions.assertEquals(expected, actual);
    }
}