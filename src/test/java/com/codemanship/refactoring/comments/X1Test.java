package com.codemanship.refactoring.comments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class X1Test {

    @Test
    void given7And12WhenSumOfSquaresThenResultIsSumOfSquareOfEachValueInclusive() {
        int a = 7;
        int b = 12;

        int expected = 7*7 + 8*8 + 9*9 + 10*10 + 11*11 + 12*12;

        int actual = X1.sumSquaresBetweenBounds(a, b);

        assertEquals(expected, actual);
    }
}