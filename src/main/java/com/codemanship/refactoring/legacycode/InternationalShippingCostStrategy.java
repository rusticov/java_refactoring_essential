package com.codemanship.refactoring.legacycode;

public class InternationalShippingCostStrategy extends ShippingCostStrategy {

    @Override
    public double calculateOrderCost(Order order) {
        return order.getWeightKg() * 1.5;
    }
}
