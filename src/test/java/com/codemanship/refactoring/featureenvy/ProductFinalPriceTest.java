package com.codemanship.refactoring.featureenvy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductFinalPriceTest {

    @Test
    void shouldApplyDiscountWhenProductIsOnSale() {
        Product product = new Product(100.0, true);

        double result = product.finalPrice();

        assertEquals(80.0, result);
    }

    @Test
    void shouldNotApplyDiscountWhenProductIsNotOnSale() {
        Product product = new Product(100.0, false);

        double result = product.finalPrice();

        assertEquals(100.0, result);
    }

    @Test
    void shouldReturnZeroWhenPriceIsZeroEvenIfOnSale() {
        Product product = new Product(0.0, true);

        double result = product.finalPrice();

        assertEquals(0.0, result);
    }
}