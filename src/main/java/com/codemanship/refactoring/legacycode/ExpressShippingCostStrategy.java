package com.codemanship.refactoring.legacycode;

public class ExpressShippingCostStrategy extends ShippingCostStrategy {

    @Override
    public double calculateOrderCost(Order order) {
        return order.getWeightKg() * 0.8 + order.getDistanceKm() * 0.1;
    }
}
