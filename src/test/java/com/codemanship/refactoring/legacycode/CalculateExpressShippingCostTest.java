package com.codemanship.refactoring.legacycode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateExpressShippingCostTest {

    @Test
    @DisplayName("given 1kg item over 2km when calculating shipping then cost is 1.0")
    void weightOf1KgOver1Km() throws IOException, InterruptedException {
        Orders orders = mock(Orders.class);
        when(orders.fetchOrder(1001)).thenReturn(
            new Order(
                1001,
                "EXPRESS",
                1.0,
                2.0,
                false)
        );

        ShippingCalculator calculator = new ShippingCalculator(orders);
        assertEquals(1.0, calculator.calculateShipping(1001));
    }
}
