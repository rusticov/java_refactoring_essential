package com.codemanship.refactoring.legacycode;

public class StandardShippingCostStrategy implements ShippingCostStrategy {

    @Override
    public double calculateOrderCost(Order order) {
        return order.getWeightKg() * 0.5;
    }
}
