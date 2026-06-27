package com.codemanship.refactoring.legacycode;

public class InternationalShippingCostStrategy implements ShippingCostStrategy {

    @Override
    public double calculateOrderCost(Order order) {
        return order.getWeightKg() * 1.5;
    }
}
