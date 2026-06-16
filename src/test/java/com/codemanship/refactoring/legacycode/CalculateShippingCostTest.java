package com.codemanship.refactoring.legacycode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateShippingCostTest {

    @Test
    @DisplayName("given order 1001 when calculating shipping cost then cost is 2.5")
    void order1001() {
        ShippingCalculator calculator = new ShippingCalculator();
        assertEquals(2.5, calculator.calculateShipping(1001));
    }
}
