package com.codemanship.refactoring.legacycode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateOvernightShippingCostTest {

    @Test
    @DisplayName("given weight of 1kg when calculating shipping cost then cost is 26.2")
    void weightOf1kg() throws IOException, InterruptedException {
        Orders orders = mock(Orders.class);
        when(orders.fetchOrder(1000)).thenReturn(
            new Order(
                1000,
                "OVERNIGHT",
                1.0,
                0.0,
                false)
        );

        ShippingCalculator calculator = new ShippingCalculator(orders);
        assertEquals(26.2, calculator.calculateShipping(1000));
    }

    @Test
    @DisplayName("given weight of 2kg when calculating shipping cost then cost is 27.4")
    void weightOf2kg() throws IOException, InterruptedException {
        Orders orders = mock(Orders.class);
        when(orders.fetchOrder(1000)).thenReturn(
            new Order(
                1000,
                "OVERNIGHT",
                2.0,
                0.0,
                false)
        );

        ShippingCalculator calculator = new ShippingCalculator(orders);
        assertEquals(27.4, calculator.calculateShipping(1000));
    }
}
