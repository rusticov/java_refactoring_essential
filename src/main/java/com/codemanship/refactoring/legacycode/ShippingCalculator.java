package com.codemanship.refactoring.legacycode;

public class ShippingCalculator {

    private final Orders orders;

    public ShippingCalculator(Orders orders) {
        this.orders = orders;
    }

    public double calculateShipping(int orderId) {
        try {
            Order order = orders.fetchOrder(orderId);
            return createCostStrategy(order.getShippingType()).calculateOrderCost(order);
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

    private ShippingCostStrategy createCostStrategy(String shippingType) {
        return switch (shippingType) {
            case "STANDARD" -> new StandardShippingCostStrategy();
            case "EXPRESS" -> new ExpressShippingCostStrategy();
            default -> new ShippingCostStrategy();
        };
    }
}
