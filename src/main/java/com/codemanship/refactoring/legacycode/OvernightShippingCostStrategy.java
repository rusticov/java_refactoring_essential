package com.codemanship.refactoring.legacycode;

public class OvernightShippingCostStrategy extends ShippingCostStrategy {

    @Override
    public double calculateOrderCost(Order order) {
        return order.getWeightKg() * 1.2 + 25;
    }
}
