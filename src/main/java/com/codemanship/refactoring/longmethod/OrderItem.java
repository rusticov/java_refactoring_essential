package com.codemanship.refactoring.longmethod;

public record OrderItem(double price, double quantity) {

    double subtotal() {
        return price() * quantity();
    }
}
