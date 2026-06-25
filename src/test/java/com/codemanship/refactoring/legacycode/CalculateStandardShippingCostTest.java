package com.codemanship.refactoring.legacycode;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStandardShippingCostTest {

    @Test
    void givenStandardShippingAndWeightIs2KgWhenCalculatingCostThenCostIs1() throws IOException, InterruptedException {
        Orders orders = mock(Orders.class);
        when(orders.fetchOrder(1000)).thenReturn(
            new Order(
                1000,
                "STANDARD",
                2.0,
                0.0,
                false)
        );

        ShippingCalculator calculator = new ShippingCalculator(orders);
        assertEquals(1.0, calculator.calculateShipping(1000));
    }
}
