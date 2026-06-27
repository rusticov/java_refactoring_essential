package com.codemanship.refactoring.longmethod;

public class Customer {
    private final boolean loyal;

    public Customer(boolean loyal) {
        this.loyal = loyal;
    }

    public boolean isLoyal() {
        return loyal;
    }

    double calculateDiscount(double subtotal) {
        if (isLoyal()) {
            return subtotal * 0.10;
        }
        if (isLargePurchaseDiscount(subtotal)) {
            return subtotal * 0.05;
        }
        return 0.0;
    }

    private static boolean isLargePurchaseDiscount(double subtotal) {
        return subtotal > 100;
    }
}
