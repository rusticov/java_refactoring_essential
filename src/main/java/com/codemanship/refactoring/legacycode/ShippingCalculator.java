package com.codemanship.refactoring.legacycode;

public class ShippingCalculator {

    private final Orders orders;

    public ShippingCalculator(Orders orders) {
        this.orders = orders;
    }

    public double calculateShipping(int orderId) {
        try {
            Order order = orders.fetchOrder(orderId);
            return AvailableShippingCostStrategies.forShippingType(order.getShippingType()).
                calculateOrderCost(order);
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

}
