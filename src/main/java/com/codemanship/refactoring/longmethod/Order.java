package com.codemanship.refactoring.longmethod;

import java.util.List;

public class Order {

    private static final double VAT_RATE = 0.20;

    private final List<OrderItem> items;
    private final Customer customer;

    public Order(List<OrderItem> items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }

    public OrderSummary summarise() {

        validateItems();

        double subtotal = calculateSubtotal();

        double discount = customer.calculateDiscount(subtotal);

        double taxableAmount = subtotal - discount;
        double tax = calculateTax(taxableAmount);

        double total = calculateTotal(taxableAmount, tax);

        return new OrderSummary(subtotal, discount, tax, total);
    }

    private void validateItems() {
        if (items == null) {
            throw new IllegalStateException("Items cannot be null");
        }
        if (items.isEmpty()) {
            throw new IllegalStateException("Order must contain items");
        }
    }

    private double calculateSubtotal() {
        double subtotal = 0.0;
        for (OrderItem item : items) {
            subtotal += item.subtotal();
        }
        return subtotal;
    }

    private static double calculateTax(double taxableAmount) {
        return taxableAmount * VAT_RATE;
    }

    private static double calculateTotal(double taxableAmount, double tax) {
        return taxableAmount + tax;
    }
}
