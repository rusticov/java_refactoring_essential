package com.codemanship.refactoring.legacycode.costStrategies;

import com.codemanship.refactoring.legacycode.Order;

class ExpressShippingCostStrategy implements ShippingCostStrategy {

    @Override
    public double calculateOrderCost(Order order) {
        return order.getWeightKg() * 0.8 + order.getDistanceKm() * 0.1;
    }
}
