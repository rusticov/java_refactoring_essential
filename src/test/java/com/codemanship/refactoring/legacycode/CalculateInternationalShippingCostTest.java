package com.codemanship.refactoring.legacycode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateInternationalShippingCostTest {

    @Test
    @DisplayName("given weight is 1kg when calculating shipping cost then cost is 1.5")
    void weight1kg() throws IOException, InterruptedException {
        Orders orders = mock(Orders.class);
        when(orders.fetchOrder(1004)).thenReturn(
            new Order(
                1004,
                "INTERNATIONAL",
                1.0,
                2.0,
                false)
        );
        ShippingCalculator calculator = new ShippingCalculator(orders);
        assertEquals(1.5, calculator.calculateShipping(1004));
    }

    @Test
    @DisplayName("given weight is 2kg when calculating shipping cost then cost is 3.0")
    void weight2kg() throws IOException, InterruptedException {
        Orders orders = mock(Orders.class);
        when(orders.fetchOrder(1004)).thenReturn(
            new Order(
                1004,
                "INTERNATIONAL",
                2.0,
                2.0,
                false)
        );
        ShippingCalculator calculator = new ShippingCalculator(orders);
        assertEquals(3.0, calculator.calculateShipping(1004));
    }
}
