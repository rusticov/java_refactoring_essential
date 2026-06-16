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
        double discount = 0.0;
        if (isLoyal()) {
            discount = subtotal * 0.10;
        } else if (subtotal > 100) {
            discount = subtotal * 0.05;
        }
        return discount;
    }
}
