package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Get_back_test {

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "14, -1",
            "16, 8",
            "7, -1"
    })
    void testSqFunction(int input, int expected) {

        int actual = Get_back.sq(input);

        assertEquals(expected, actual);
    }
}