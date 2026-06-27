package com.codemanship.refactoring.longmethod;

public class Customer {

    private static final double LOYALTY_DISCOUNT_PERCENTAGE = 0.10;
    private static final double LARGE_PURCHASE_DISCOUNT_PERCENTAGE = 0.05;

    private static final double NO_DISCOUNT_AMOUNT = 0.0;
    private static final double AMOUNT_TO_EXCEED_FOR_LARGE_PURCHASE = 100;

    private final boolean loyal;

    public Customer(boolean loyal) {
        this.loyal = loyal;
    }

    public boolean isLoyal() {
        return loyal;
    }

    double calculateDiscount(double subtotal) {
        if (isLoyal()) {
            return subtotal * LOYALTY_DISCOUNT_PERCENTAGE;
        }
        if (isLargePurchaseDiscount(subtotal)) {
            return subtotal * LARGE_PURCHASE_DISCOUNT_PERCENTAGE;
        }
        return NO_DISCOUNT_AMOUNT;
    }

    private static boolean isLargePurchaseDiscount(double subtotal) {
        return subtotal > AMOUNT_TO_EXCEED_FOR_LARGE_PURCHASE;
    }
}
