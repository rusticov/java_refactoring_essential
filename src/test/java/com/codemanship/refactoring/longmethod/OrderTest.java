package com.codemanship.refactoring.longmethod;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OrderTest {

    @Test
    void summarise_calculatesCorrectSummary_forNonLoyalCustomer_underThreshold() {
        Order order = new Order(
                List.of(
                        new OrderItem(10.0, 2), // 20
                        new OrderItem(5.0, 2)   // 10
                ),
                new Customer(false)
        );

        OrderSummary summary = order.summarise();

        assertEquals(30.0, summary.subtotal());
        assertEquals(0.0, summary.discount());
        assertEquals(6.0, summary.tax());
        assertEquals(36.0, summary.total());
    }

    @Test
    void summarise_appliesLoyalCustomerDiscount() {
        Order order = new Order(
                List.of(new OrderItem(50.0, 1)),
                new Customer(true)
        );

        OrderSummary summary = order.summarise();

        assertEquals(50.0, summary.subtotal());
        assertEquals(5.0, summary.discount());
        assertEquals(9.0, summary.tax());
        assertEquals(54.0, summary.total());
    }

    @Test
    void summarise_appliesBulkDiscount_forNonLoyalCustomer_overThreshold() {
        Order order = new Order(
                List.of(new OrderItem(120.0, 1)),
                new Customer(false)
        );

        OrderSummary summary = order.summarise();

        assertEquals(120.0, summary.subtotal());
        assertEquals(6.0, summary.discount());
        assertEquals(22.8, summary.tax());
        assertEquals(136.8, summary.total());
    }

    // -------------------------
    // Guard conditions
    // -------------------------

    @Test
    void summarise_throwsException_whenItemsIsNull() {
        Order order = new Order(null, new Customer(false));

        IllegalStateException ex = assertThrows(
                IllegalStateException.class,
                order::summarise
        );

        assertEquals("Items cannot be null", ex.getMessage());
    }

    @Test
    void summarise_throwsException_whenItemsIsEmpty() {
        Order order = new Order(List.of(), new Customer(false));

        IllegalStateException ex = assertThrows(
                IllegalStateException.class,
                order::summarise
        );

        assertEquals("Order must contain items", ex.getMessage());
    }

    // -------------------------
    // Boundary test
    // -------------------------

    @Test
    void summarise_noDiscount_whenNonLoyalCustomer_atThreshold() {
        Order order = new Order(
                List.of(new OrderItem(100.0, 1)),
                new Customer(false)
        );

        OrderSummary summary = order.summarise();

        assertEquals(100.0, summary.subtotal());
        assertEquals(0.0, summary.discount());
        assertEquals(20.0, summary.tax());
        assertEquals(120.0, summary.total());
    }
}