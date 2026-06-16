package com.codemanship.refactoring.legacycode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateStandardShippingCostTest {

    @Test
    void givenStandardShippingAndWeightIs2KgWhenCalculatingCostThenCostIs1() {
        ShippingCalculator calculator = new ShippingCalculator(new StubOrders(
            new Order(
                1000,
                "STANDARD",
                2.0,
                0.0,
                false)
        ));
        assertEquals(1.0, calculator.calculateShipping(1000));
    }
}
